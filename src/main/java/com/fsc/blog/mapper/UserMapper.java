package com.fsc.blog.mapper;

import com.fsc.blog.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName:UserMapper
 * Package:com.fsc.blog.mapper
 * Description:
 *
 * @Author: fsc
 * @Create: 2025/6/8 - 11:11
 * @Version: v1.0
 */
@Mapper
public interface UserMapper {

    // 创建一个用户
    int insertUser(User user);

    // 根据用户名查询用户
    User findUserByUsername(String username);

    // 根据用户名删除用户
    int deleteUser(String username);
}
