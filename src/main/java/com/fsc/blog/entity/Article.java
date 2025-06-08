package com.fsc.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * ClassName:Article
 * Package:com.fsc.blog.entity
 * Description:
 *
 * @Author: fsc
 * @Create: 2025/5/29 - 17:14
 * @Version: v1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {
    // 文章唯一标识
    private Long id;

    private String title;

    // 文章内容
    private String content;

    // 作者的ID，用于关联用户表
    private Long userId;

    // 创建时间
    private LocalDateTime createdAt;

    // 更新时间
    private LocalDateTime updatedAt;
}
