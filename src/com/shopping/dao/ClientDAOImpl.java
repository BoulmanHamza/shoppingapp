package com.shopping.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shopping.model.Client;
import com.shopping.util.ConnectionBd;

public class ClientDAOImpl implements ClientDAO{

	@Override
	public void create(Client client) throws SQLException {
		String Query="insert into client (id_client,nom,prenom) Values (?,?,?)";
		PreparedStatement ps=ConnectionBd.getCnx().prepareStatement(Query);
		ps.setInt(1, client.getId_client());
		ps.setString(2, client.getNom());
		ps.setString(3, client.getPrenom());
		ps.executeUpdate();
		 
	}

	@Override
	public void delete(int idClient) throws SQLException {
		// TODO Auto-generated method stub
		String query="delete from client where id_client= ?";
		PreparedStatement ps =ConnectionBd.getCnx().prepareStatement(query);
		ps.setInt(1, idClient);
		ps.executeUpdate();
		
	}

	@Override
	public Client findById(int idArticle) throws SQLException{
		String SelectQuery="SELECT * from Client where id_client="+idArticle;
        Client client1=new Client();
        try{
            PreparedStatement ps=ConnectionBd.getCnx().prepareStatement(SelectQuery);
            ResultSet rs;
            rs=ps.executeQuery();
            while(rs.next())
            {
                int idClient=rs.getInt(1);
                String nom=rs.getString(2);
                String prenom=rs.getString(3);
                client1=new Client(idClient,nom,prenom);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error in getData"+e);
        }
        return client1;
	}

	@Override
	public List<Client> findAll() throws SQLException{
		String SelectQuery="SELECT * from Client";
        List<Client> listClients=new ArrayList<>();
        try{
            PreparedStatement ps=ConnectionBd.getCnx().prepareStatement(SelectQuery);
            ResultSet rs;
            rs=ps.executeQuery();
            while(rs.next())
            {
                listClients.add(new Client(rs.getInt(1),rs.getString(2),rs.getString(3)));
            }
        }
        catch(Exception e)
        {
            System.out.println("Error in getData"+e);
        }
        return listClients;
	}

	@Override
	public void update(Client client) throws SQLException{
		String updateQuery="Update Client set nom=?, prenom=? where id_client="+client.getId_client();
            PreparedStatement ps= ConnectionBd.getCnx().prepareStatement(updateQuery);
            ps.setString(1,client.getNom());
            ps.setString(2,client.getPrenom());
            ps.executeUpdate();
		
	}
}
