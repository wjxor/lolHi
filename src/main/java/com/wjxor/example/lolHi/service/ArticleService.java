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

	public List<Article> getArticles(Map<String, Object> param) {
		int page = Util.getAsInt(param.get("page"), 1);

		// 한 리스트에 나올 수 있는 게시물 개수
		int itemsCountInAPage = Util.getAsInt(param.get("itemsCountInAPage"), 10);

		if (itemsCountInAPage > 100) {
			itemsCountInAPage = 100;
		}

		else if (itemsCountInAPage < 1) {
			itemsCountInAPage = 1;
		}

		int limitFrom = (page - 1) * itemsCountInAPage;
		int limitTake = itemsCountInAPage;

		param.put("limitFrom", limitFrom);
		param.put("limitTake", limitTake);

		return articleDao.getArticles(param);
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

	public int getTotalCount() {

		return articleDao.getTotalCount();
	}

}