package com.shopping.dao;

import java.util.List;

import com.shopping.model.article;

public interface ArticleDAO {
	public void create(article a);
	public void delete(article a);
	public article findById(int IdArticle);
	public List<article> findAll();
	public void update(article a);
}
