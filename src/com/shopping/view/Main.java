package com.shopping.view;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("===> Menu : ");
        System.out.println("1: Lister les articles");
        System.out.println("2: ajouter client");
        System.out.println("3: Lister les factures");
        System.out.println("4: créer une facture a un client");
        System.out.println("q: Quitter");

        String choice;
        do {
        	System.out.println("===> Veuillez choisir un numero : ");
            Scanner scan = new Scanner(System.in);
            choice = scan.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Okkk");
                    break;
                case "2":
                    
                    break;
                case "3":

                case "4":

            }
        }while (choice != "5");
    }
}