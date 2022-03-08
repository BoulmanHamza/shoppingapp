package com.shopping.dao;

import java.util.List;

import com.shopping.model.Article;

public interface ArticleDAO {
	public void create(Article a);
	public void delete(Article a);
	public Article findById(int IdArticle);
	public List<Article> findAll();
	public void update(Article a);
}
