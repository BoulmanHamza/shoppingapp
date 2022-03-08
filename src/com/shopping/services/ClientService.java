package com.shopping.services;

import java.sql.SQLException;
import java.util.List;

import com.shopping.dao.ClientDAO;
import com.shopping.dao.ClientDAOImpl;
import com.shopping.model.Client;

public class ClientService {
	ClientDAO clientDAO=new ClientDAOImpl();
	public void createService(Client c1) throws Exception {
		   clientDAO.create(c1);
		}
	
		public List<Client> findAllClient() throws SQLException {

		    return clientDAO.findAll();
		}

		public Client findByIdClient(int id) throws SQLException {
		    return clientDAO.findById(id);
		}

		public void updateClient(Client c1) throws SQLException {
		    clientDAO.update(c1);
		}

		public void deleteClient(int id) throws SQLException {
		    clientDAO.delete(id);
		}
	
}
