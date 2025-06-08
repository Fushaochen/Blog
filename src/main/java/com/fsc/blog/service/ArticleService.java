package com.fsc.blog.service;

import com.fsc.blog.entity.Article;

import java.util.List;

/**
 * ClassName:ArticleService
 * Package:com.fsc.blog.service.impl
 * Description:
 *
 * @Author: fsc
 * @Create: 2025/5/29 - 20:22
 * @Version: v1.0
 */
public interface ArticleService {
    Article createArticle(Article article);
    Article getArticleById(Long id);
    List<Article> getAllArticles();
}
