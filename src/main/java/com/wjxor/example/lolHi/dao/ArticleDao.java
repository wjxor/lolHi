package com.wjxor.example.lolHi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wjxor.example.lolHi.dto.Article;

@Mapper
public interface ArticleDao {

	List<Article> getArticles();

}
