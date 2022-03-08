package com.shopping.services;

import java.sql.SQLException;
import java.util.List;

import com.shopping.dao.ArticleDAO;
import com.shopping.dao.ArticleDAOImpl;
import com.shopping.model.Article;

public class ArticleService {
	ArticleDAO articleDAO=new ArticleDAOImpl();

    public List<Article> findAllArticles() throws SQLException{
        return articleDAO.getArticles();
    }
    
}
