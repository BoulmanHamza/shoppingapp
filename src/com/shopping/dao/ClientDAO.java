package com.shopping.dao;

import java.sql.SQLException;
import java.util.List;
import com.shopping.model.Client;

public interface ClientDAO {
	public void create(Client c) throws Exception;
	public void delete(int idClient) throws SQLException;
	public Client findById(int idArticle) throws SQLException;
	public List<Client> findAll() throws SQLException;
	public void update(Client c) throws SQLException;

}
