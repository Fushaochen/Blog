package com.fsc.blog.controller;

import com.fsc.blog.entity.User;
import com.fsc.blog.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName:UserController
 * Package:com.fsc.blog.controller
 * Description:
 *
 * @Author: fsc
 * @Create: 2025/6/8 - 11:09
 * @Version: v1.0
 */
@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User newUser = userService.createUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @GetMapping("{username}")
    public ResponseEntity<User> getUserByUsername(@PathVariable String username){
        User newUser = userService.getUserByUsername(username);
        return ResponseEntity.ok(newUser);
    }

    @DeleteMapping("{username}")
    public ResponseEntity<Void> deleteUser(@PathVariable String username) {
        int i = userService.deleteUser(username);
        return ResponseEntity.noContent().build();
    }
}
