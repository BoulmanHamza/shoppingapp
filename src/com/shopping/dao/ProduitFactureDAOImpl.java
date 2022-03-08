package com.shopping.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.shopping.model.Client;
import com.shopping.model.ProduitFacture;
import com.shopping.services.ArticleService;
import com.shopping.util.ConnectionBd;

public class ProduitFactureDAOImpl implements ProduitFactureDAO{

	@Override
	public void create(ProduitFacture c) throws Exception {
	
		
	}

	@Override
	public void delete(int idFacture) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProduitFacture findById(int idFacture) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProduitFacture> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(ProduitFacture pF) throws SQLException {
		// TODO Auto-generated method stub
		
	}
}
