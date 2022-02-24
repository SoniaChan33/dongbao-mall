package com.msb.dongbao.ums.service;

import com.msb.dongbao.ums.entity.dto.UmsMemberLoginParamDTO;
import com.msb.dongbao.ums.entity.dto.UmsMemberRegisterParamDTO;

/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author 陈慧珊
 * @since 2022-01-18
 */

public interface UmsMemberService{
    String register(UmsMemberRegisterParamDTO umsMemberRegisterParamDTO);
    String login(UmsMemberLoginParamDTO umsMemberLoginParamDTO);
}
