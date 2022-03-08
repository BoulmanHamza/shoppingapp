package com.shopping.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shopping.model.Article;
import com.shopping.util.ConnectionBd;

public class ArticleDAOImpl implements ArticleDAO {
    
	@Override
	public List<Article> getArticles() throws SQLException {
		String query = "select * from article";
        PreparedStatement ps
            = ConnectionBd.getCnx().prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<Article> listArticles = new ArrayList<Article>();
        while (rs.next()) {
            Article article = new Article();
            article.setId_article(rs.getInt("id_article"));
            article.setNom(rs.getString("nom"));
            article.setPrix(rs.getDouble("prix"));
            listArticles.add(article);
        }
        rs.close();
        return listArticles;
	}
	
	
}
