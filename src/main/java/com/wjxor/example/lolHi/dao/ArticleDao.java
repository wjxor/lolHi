package com.wjxor.example.lolHi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wjxor.example.lolHi.dto.Article;

@Mapper
public interface ArticleDao {

	List<Article> getArticles();

	Article getArticleById(@Param("id") int id);

	Article deleteArticleById(@Param("id") int id);

}
