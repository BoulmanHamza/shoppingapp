package com.shopping.model;

public class Article {
	private int idArticle;
	private String nom;
	private double prix;
	
	
	
	public Article() {
		super();
	}

	public Article(int id_article, String nom, double prix){
		super();
		this.idArticle = id_article;
		this.nom = nom;
		this.prix = prix;
	}

	public int getId_article() {
		return idArticle;
	}

	public void setId_article(int idArticle) {
		this.idArticle = idArticle;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}



	@Override
	public String toString() {
		return "Article [idArticle=" + idArticle + ", nom=" + nom + ", prix=" + prix + "]";
	}
	
	
	
	

}
