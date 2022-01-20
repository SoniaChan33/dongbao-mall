package com.msb.dongbao.portal.web.controller;

import com.msb.dongbao.ums.entity.dto.UmsMemberRegisterParamDTO;
import com.msb.dongbao.ums.mapper.UmsMemberMapper;
import com.msb.dongbao.ums.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * <p>
 * 后台用户表 前端控制器
 * </p>
 *
 * @author 陈慧珊
 * @since 2022-01-18
 */
@RestController
@RequestMapping("/ums-member")
public class UmsMemberController {
    @Autowired
    UmsMemberService umsMemberService;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/register")
    public String register(@RequestBody UmsMemberRegisterParamDTO umsMemberRegisterParamDTO){
        umsMemberService.register(umsMemberRegisterParamDTO);
        return "register";
    }
}

