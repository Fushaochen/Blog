package com.fsc.blog.service;

import com.fsc.blog.entity.User;

/**
 * ClassName:UserService
 * Package:com.fsc.blog.service.impl
 * Description:
 *
 * @Author: fsc
 * @Create: 2025/6/8 - 11:31
 * @Version: v1.0
 */
public interface UserService {

    User createUser(User user);

    // 根据用户名查询用户
    User getUserByUsername(String username);

    // 根据用户名删除用户
    int deleteUser(String username);
}
