package com.fsc.blog.service;

import com.fsc.blog.entity.Article;
import com.fsc.blog.mapper.ArticleMapper;
import com.fsc.blog.service.impl.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * ClassName:ArticleServiceImpl
 * Package:com.fsc.blog.service
 * Description:
 *
 * @Author: fsc
 * @Create: 2025/5/29 - 20:22
 * @Version: v1.0
 */
@Service
@AllArgsConstructor
public class ArticleServiceImpl implements ArticleService {

    private final ArticleMapper articleMapper;

    @Override
    public Article createArticle(Article article) {

        article.setCreatedAt(LocalDateTime.now());
        article.setUpdatedAt(LocalDateTime.now());
        articleMapper.insertArticle(article);
        return article;
    }

    @Override
    public Article getArticleById(Long id) {
        Article article = articleMapper.findById(id);
        return article;
    }

    @Override
    public List<Article> getAllArticles() {
        List<Article> all = articleMapper.findAll();
        return all;
    }
}
