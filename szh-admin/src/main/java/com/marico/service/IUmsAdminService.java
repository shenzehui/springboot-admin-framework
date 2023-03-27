package com.marico.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.marico.dto.AdminParam;
import com.marico.dto.UpdateAdminPasswordParam;
import com.marico.model.UmsAdmin;
import com.baomidou.mybatisplus.extension.service.IService;
import com.marico.model.UmsRole;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author marico
 * @since 2023-03-25
 */
public interface IUmsAdminService extends IService<UmsAdmin> {

    /**
     * 根据用户名获取管理员信息
     *
     * @param username
     * @return
     */
    UserDetails loadUserByUsername(String username);

    /**
     * 登录功能
     *
     * @param username 用户名
     * @param password 密码
     * @return token
     */
    String login(String username, String password);

    /**
     * 注册功能
     *
     * @param adminParam 用户信息
     * @return 注册用户
     */
    UmsAdmin register(AdminParam adminParam);

    /**
     * 修改用户信息
     *
     * @param id    用户id
     * @param admin 用户信息
     * @return 修改行数
     */
    boolean update(Long id, UmsAdmin admin);

    /**
     * 刷新token
     *
     * @param token 登录令牌
     * @return 刷新后生成的token
     */
    String refreshToken(String token);

    /**
     * 根据用户名获取后台管理员
     *
     * @param username 用户名
     * @return 管理员对象
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 根据用户id获取角色信息
     *
     * @param adminId 用户id
     * @return 角色信息
     */
    List<UmsRole> getRoleList(Long adminId);

    /**
     * 根据用户名或姓名分页获取用户列表
     * @param keyword 关键词
     * @param pageSize 每页数
     * @param pageNum 当前页
     * @return 用户列表
     */
    Page<UmsAdmin> list(String keyword, Integer pageSize, Integer pageNum);

    /**
     * 修改密码
     * @param updatePasswordParam dto对象
     * @return 数据库修改行数
     */
    int updatePassword(UpdateAdminPasswordParam updatePasswordParam);

    /**
     * 修改用户角色
     * @param adminId 用户id
     * @param roleIds 角色id列表
     * @return 数据库修改行数
     */
    int updateRole(Long adminId, List<Long> roleIds);
}
