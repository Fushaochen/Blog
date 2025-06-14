package com.fsc.blog.controller;

import com.fsc.blog.entity.Article;
import com.fsc.blog.resultResp.Result;
import com.fsc.blog.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName:ArticleController
 * Package:com.fsc.blog.controller
 * Description:
 *
 * @Author: fsc
 * @Create: 2025/5/29 - 20:26
 * @Version: v1.0
 */
@RestController
@RequestMapping("/api/v1/articles")
@AllArgsConstructor
public class ArticleController {


    private final ArticleService articleService;

    @PostMapping
    public Result<Article> createArticle(@RequestBody Article article){
        Article createdArticle = articleService.createArticle(article);
        return Result.ok(createdArticle);
    }

    @GetMapping("/{id}")
    public Result<Article> getArticleById(@PathVariable("id") Long id){
        Article article = articleService.getArticleById(id);
        return Result.ok(article);
    }

    @GetMapping
    public Result<List<Article>> getAllArticles(){
        List<Article> articles = articleService.getAllArticles();
        return Result.ok(articles);
    }
}
