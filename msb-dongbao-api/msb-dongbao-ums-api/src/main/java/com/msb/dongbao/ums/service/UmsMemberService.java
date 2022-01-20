package com.msb.dongbao.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.msb.dongbao.ums.entity.UmsMember;
import com.msb.dongbao.ums.entity.dto.UmsMemberRegisterParamDTO;

/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author 陈慧珊
 * @since 2022-01-18
 */

public interface UmsMemberService extends IService<UmsMember> {
    public String register(UmsMemberRegisterParamDTO umsMemberRegisterParamDTO);
}
