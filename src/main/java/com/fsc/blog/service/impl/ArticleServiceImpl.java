package com.fsc.blog.service.impl;

import com.fsc.blog.entity.Article;
import com.fsc.blog.exception.ResourceNotFoundException;
import com.fsc.blog.mapper.ArticleMapper;
import com.fsc.blog.resultResp.Code;
import com.fsc.blog.service.ArticleService;
import lombok.AllArgsConstructor;
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
        if (article == null){
            throw new ResourceNotFoundException(Code.ARTICLE_NOTFOUND);
        }
        return article;
    }

    @Override
    public List<Article> getAllArticles() {
        List<Article> all = articleMapper.findAll();
        return all;
    }
}
