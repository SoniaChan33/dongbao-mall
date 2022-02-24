package com.msb.dongbao.ums.service.impl;

import com.msb.dongbao.ums.entity.UmsMember;
import com.msb.dongbao.ums.entity.dto.UmsMemberLoginParamDTO;
import com.msb.dongbao.ums.entity.dto.UmsMemberRegisterParamDTO;
import com.msb.dongbao.ums.mapper.UmsMemberMapper;
import com.msb.dongbao.ums.service.UmsMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author 陈慧珊
 * @since 2022-01-18
 */
@Service
public class UmsMemberServiceImpl extends ServiceImpl<UmsMemberMapper, UmsMember> implements UmsMemberService {

    @Autowired
    UmsMemberMapper umsMemberMapper;


    @Autowired
    private PasswordEncoder passwordEncoder;

    public String register(UmsMemberRegisterParamDTO umsMemberRegisterParamDTO){
        UmsMember u = new UmsMember();
        BeanUtils.copyProperties(umsMemberRegisterParamDTO, u);

        String encode = passwordEncoder.encode(umsMemberRegisterParamDTO.getPassword());

        u.setPassword(encode);

        umsMemberMapper.insert(u);
        return "success";
    }

    @Override
    public String login(UmsMemberLoginParamDTO umsMemberLoginParamDTO) {
        UmsMember umsMember = umsMemberMapper.selectByName(umsMemberLoginParamDTO.getUsername());
        if(null !=  umsMember){
            String passwordDb = umsMember.getPassword();
            if(!passwordEncoder.matches(umsMemberLoginParamDTO.getPassword(),passwordDb)){
                return "密码不正确";
            }
        }else{
            return "用户不存在";
        }
        System.out.println("登录成功");
        return "token";
    }
}
