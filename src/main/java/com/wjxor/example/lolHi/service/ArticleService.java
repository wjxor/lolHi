package com.wjxor.example.lolHi.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjxor.example.lolHi.dao.ArticleDao;
import com.wjxor.example.lolHi.dto.Article;
import com.wjxor.example.lolHi.util.Util;

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

	public void deleteArticleById(int id) {

		articleDao.deleteArticleById(id);
	}

	public void modifyArticle(int id, String title, String body) {
		articleDao.modifyArticle(id, title, body);

	}

	public int writeArticle(Map<String, Object> param) {
		articleDao.writeArticle(param);

		int id = Util.getAsInt(param.get("id"));

		return id;
	}

}