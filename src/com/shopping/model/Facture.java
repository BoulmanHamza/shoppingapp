package com.shopping.model;

import java.util.Date;

public class Facture {
	private int numFacture;
	private Date dateFacture;
	private int idClient;
	public Facture() {
		super();
	}
	public Facture(int numFacture, Date dateFacture, int idClient) {
		super();
		this.numFacture = numFacture;
		this.dateFacture = dateFacture;
		this.idClient = idClient;
	}
	public int getNumFacture() {
		return numFacture;
	}
	public void setNumFacture(int numFacture) {
		this.numFacture = numFacture;
	}
	public Date getDateFacture() {
		return dateFacture;
	}
	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	
	
	
}
