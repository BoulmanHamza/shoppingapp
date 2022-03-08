package com.shopping.model;

public class produit_facture {
	private Integer numFacture;
	private int idArticle;
	private int nombre;
	public produit_facture() {
		super();
	}
	public produit_facture(Integer numFacture, int idArticle, int nombre) {
		super();
		this.numFacture = numFacture;
		this.idArticle = idArticle;
		this.nombre = nombre;
	}
	public Integer getNumFacture() {
		return numFacture;
	}
	public void setNumFacture(Integer numFacture) {
		this.numFacture = numFacture;
	}
	public int getIdArticle() {
		return idArticle;
	}
	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	
	
	

}
