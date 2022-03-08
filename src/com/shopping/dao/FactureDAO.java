package com.shopping.dao;

import java.sql.SQLException;
import java.util.List;

import com.shopping.model.Facture;

public interface FactureDAO {
	
	  public int add(Facture facture)throws SQLException;
	  public void delete(int id) throws SQLException;
	  public List<Facture> getFacturesClient(int id) throws SQLException;
	  public List<Facture> getFactures() throws SQLException;
	  public void update(Facture emp)  throws SQLException;
}
