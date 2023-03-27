package com.marico.mapper;

import com.marico.model.UmsRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 后台用户角色表 Mapper 接口
 * </p>
 *
 * @author marico
 * @since 2023-03-25
 */
public interface UmsRoleMapper extends BaseMapper<UmsRole> {

    List<UmsRole> getRoleList(Long adminId);
}
