package com.msb.dongbao.ums.service.impl;

import com.msb.dongbao.ums.entity.UmsMember;
import com.msb.dongbao.ums.entity.dto.UmsMemberRegisterParamDTO;
import com.msb.dongbao.ums.mapper.UmsMemberMapper;
import com.msb.dongbao.ums.service.UmsMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
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

    public String register(UmsMemberRegisterParamDTO umsMemberRegisterParamDTO){
        UmsMember u = new UmsMember();
        BeanUtils.copyProperties(umsMemberRegisterParamDTO, u);
        umsMemberMapper.insert(u);
        return "success";
    }


}
