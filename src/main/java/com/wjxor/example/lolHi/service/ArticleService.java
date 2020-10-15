package com.wjxor.example.lolHi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjxor.example.lolHi.dao.ArticleDao;
import com.wjxor.example.lolHi.dto.Article;

@Service
public class ArticleService {
	@Autowired
	private ArticleDao articleDao;

	public List<Article> getArticles() {
		return articleDao.getArticles();
	}

	public Article getArticleById(int id) {

		return articleDao.getArticleById(id);
	}

	public Article deleteArticleById(int id) {

		return articleDao.deleteArticleById(id);
	}

}