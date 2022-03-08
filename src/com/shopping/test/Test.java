package com.shopping.test;

import java.util.Iterator;
import java.util.List;

import com.shopping.dao.ClientDAO;
import com.shopping.dao.ClientDAOImpl;
import com.shopping.model.Client;



import com.shopping.dao.ArticleDAOImpl;
import com.shopping.model.Article;

import com.shopping.util.ConnectionBd;

public class Test {
    public static void main(String[] args) {
    	ArticleDAOImpl artImp = new ArticleDAOImpl();
    	  try {

    		  ClientDAO cl=new ClientDAOImpl();
    		  Client client1 =cl.findById(80);
    		  client1.setNom("Boulman");
    		  cl.update(client1);
    		  System.out.println(client1.getId_client()+""+client1.getPrenom()+" "+client1.getNom());

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
