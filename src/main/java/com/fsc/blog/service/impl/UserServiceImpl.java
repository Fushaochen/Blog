package com.fsc.blog.service.impl;

import com.fsc.blog.entity.User;
import com.fsc.blog.exception.ResourceNotFoundException;
import com.fsc.blog.mapper.UserMapper;
import com.fsc.blog.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * ClassName:UserServiceImpl
 * Package:com.fsc.blog.service.impl
 * Description:
 *
 * @Author: fsc
 * @Create: 2025/6/8 - 11:33
 * @Version: v1.0
 */
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;


    @Override
    public User createUser(User user) {
        user.setIsDelete(0);
        user.setCreatedAt(LocalDateTime.now());
        userMapper.insertUser(user);
        return user;
    }

    @Override
    public User getUserByUsername(String username) {
        User user = userMapper.findUserByUsername(username);
        if (user == null){
            throw new ResourceNotFoundException("User not found with username: " + username);
        }
        return user;
    }

    @Override
    public int deleteUser(String username) {
        getUserByUsername(username);
        return userMapper.deleteUser(username);
    }
}
