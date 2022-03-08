package com.shopping.test;

import java.util.List;


import com.shopping.dao.ArticleDAOImpl;
import com.shopping.model.Article;
import com.shopping.util.ConnectionBd;

public class Test {
    public static void main(String[] args) {
    	ArticleDAOImpl artImp = new ArticleDAOImpl();
    	  try {
    		   ConnectionBd.getCnx();
    		   // read All
    	        List<Article> listeArticles = artImp.getArticles();
    	        for (Article article : listeArticles) {
    	            System.out.println(article);
    	        }
    	        
    	    } catch (Exception e) {
    	      System.out.println("SQLException: " + e.getMessage());
    	    }
    }
}
