package com.fsc.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * ClassName:User
 * Package:com.fsc.blog.entity
 * Description:
 *
 * @Author: fsc
 * @Create: 2025/6/8 - 10:55
 * @Version: v1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long userId;

    private String username;

    private String pwd;

    private LocalDateTime createdAt;

    private Integer isDelete;
}
