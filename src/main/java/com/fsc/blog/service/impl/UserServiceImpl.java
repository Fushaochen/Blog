package com.fsc.blog.service.impl;

import com.fsc.blog.entity.User;
import com.fsc.blog.exception.ResourceNotFoundException;
import com.fsc.blog.exception.dbSqlException;
import com.fsc.blog.mapper.UserMapper;
import com.fsc.blog.resultResp.Code;
import com.fsc.blog.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodePwd = passwordEncoder.encode(user.getPwd());
        user.setPwd(encodePwd);
        User user1 = getUserByUsername(user.getUsername());
        if (user1 != null){
            throw new dbSqlException(Code.SQL_FAIL);
        }
        userMapper.insertUser(user);
        return user;
    }

    @Override
    public User getUserByUsername(String username) {
        User user = userMapper.findUserByUsername(username);
        if (user == null){
            throw new ResourceNotFoundException(Code.USERNAME_NOTFOUND);
        }
        return user;
    }

    @Override
    public int deleteUser(String username) {
        getUserByUsername(username);
        return userMapper.deleteUser(username);
    }
}
