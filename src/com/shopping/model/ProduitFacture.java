package com.shopping.model;

public class ProduitFacture {
	private Integer numFacture;
	private int idArticle;
	private int nombre;
	public ProduitFacture() {
		super();
	}
	public ProduitFacture(Integer numFacture, int idArticle, int nombre) {
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
