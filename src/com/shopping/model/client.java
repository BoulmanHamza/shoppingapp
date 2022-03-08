package com.shopping.model;

public class client {
	private int idClient;
	private String nom;
	private String prenom;
	public client() {
		super();
	}
	public client(int id_client, String nom, String prenom) {
		super();
		this.idClient = id_client;
		this.nom = nom;
		this.prenom = prenom;
	}
	public int getId_client() {
		return idClient;
	}
	public void setId_client(int id_client) {
		this.idClient = id_client;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
}
