package com.fsc.blog.mapper;

import com.fsc.blog.entity.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName:ArticleMapper
 * Package:com.fsc.blog.mapper
 * Description:
 *
 * @Author: fsc
 * @Create: 2025/5/29 - 17:18
 * @Version: v1.0
 */
@Mapper
public interface ArticleMapper {

    // 插入一篇文章
    int insertArticle(Article article);

    // 可选 根据ID查询文章
    Article findById(Long id);

    // 可选 查询所有的文章
    List<Article> findAll();
}
