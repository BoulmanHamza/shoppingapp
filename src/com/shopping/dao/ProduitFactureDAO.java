package com.shopping.dao;

import java.sql.SQLException;
import java.util.List;

import com.shopping.model.Client;
import com.shopping.model.ProduitFacture;

public interface ProduitFactureDAO {
	public void create(ProduitFacture c) throws Exception;
	public void delete(int idFacture) throws SQLException;
	public ProduitFacture findById(int idFacture) throws SQLException;
	public List<ProduitFacture> findAll() throws SQLException;
	public void update(ProduitFacture pF) throws SQLException;

	
}
