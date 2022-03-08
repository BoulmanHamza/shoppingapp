package com.shopping.dao;

import java.sql.SQLException;
import java.util.List;

import com.shopping.model.Article;

public interface ArticleDAO {
	 public List<Article> getArticles() throws SQLException;
}
