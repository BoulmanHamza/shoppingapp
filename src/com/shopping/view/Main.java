package com.shopping.view;

import java.util.List;
import java.util.Scanner;

import com.shopping.model.Article;
import com.shopping.services.ArticleService;
import com.shopping.util.ConnectionBd;

public class Main {
    public static void main(String[] args) {
    	ArticleService articleService = new ArticleService() ;
        System.out.println("===> Menu : ");
        System.out.println("1: Lister les articles");
        System.out.println("2: ajouter client");
        System.out.println("3: Lister les factures");
        System.out.println("4: créer une facture a un client");
        System.out.println("q: Quitter");


        String choice;
        try {
            ConnectionBd.getCnx();
            //Connection BD
            do {
                System.out.println("===> Veuillez choisir un numero : ");
                Scanner scan = new Scanner(System.in);
                choice = scan.nextLine();
                switch (choice) {
                    case "1":
                        List<Article> listeArticles = articleService.findAllArticles();
                        for (Article article : listeArticles) {
                            System.out.println(article);
                        }
                        break;
                    case "2":

                        break;
                    case "3":
                    case "4":

                        break;
                    case "5":

                        break;
                }
            }while (choice != "5");

          } catch (Exception e) {
             System.out.println("SQLException: " + e.getMessage());
          }
    }
}