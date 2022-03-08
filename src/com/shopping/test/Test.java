package com.shopping.test;

import java.util.Iterator;
import java.util.List;

import com.shopping.dao.ClientDAO;
import com.shopping.dao.ClientDAOImpl;
import com.shopping.model.Client;
import com.shopping.services.ArticleService;
import com.shopping.dao.ArticleDAOImpl;
import com.shopping.model.Article;

import com.shopping.util.ConnectionBd;

public class Test {
    public static void main(String[] args) {
    	ArticleService articleService=new ArticleService();
    	  try {
    	        List<Article> listeArticles = articleService.findAllArticles();
    	        for (Article article : listeArticles) {
    	            System.out.println(article);
    	        }
    	    } catch (Exception e) {
    	      System.out.println("SQLException: " + e.getMessage());
    	    }
    }
}
