package com.msb.dongbao.ums.mapper;

import com.msb.dongbao.ums.entity.UmsMember;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * <p>
 * 后台用户表 Mapper 接口
 * </p>
 *
 * @author 陈慧珊
 * @since 2022-01-18
 */
@Repository
public interface UmsMemberMapper extends BaseMapper<UmsMember> {
    UmsMember selectByName(String name);
}