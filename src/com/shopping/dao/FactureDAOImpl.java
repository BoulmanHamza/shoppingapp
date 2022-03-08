package com.shopping.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shopping.model.Article;
import com.shopping.model.Facture;
import com.shopping.util.ConnectionBd;

public class FactureDAOImpl implements FactureDAO {
	
	@Override
    public int add(Facture facture)  throws SQLException
    {
        String query
            = "insert into facture(num_facture, "
              + "date_facture) VALUES (?, ?)";
        PreparedStatement ps
            = ConnectionBd.getCnx().prepareStatement(query);
        ps.setInt(1, facture.getNumFacture());
        ps.setDate(2, (Date) facture.getDateFacture());
        return ps.executeUpdate();
    }

	@Override
	public void delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Facture> getFacturesClient(int id) throws SQLException {
		String query = "select * from facture where id_client= ?";
        PreparedStatement ps
            = ConnectionBd.getCnx().prepareStatement(query);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        List<Facture> ls = new ArrayList();
        while (rs.next()) {
        	Facture facture = new Facture();
        	facture.setNumFacture(rs.getInt("num_facture"));
        	facture.setDateFacture(rs.getDate("num_facture"));
        	facture.setIdClient(rs.getInt("id_client"));
            ls.add(facture);
        }
        return ls;
	}

	@Override
	public List<Facture> getFactures() throws SQLException {
		String query = "select * from facture";
        PreparedStatement ps
            = ConnectionBd.getCnx().prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<Facture> ls = new ArrayList();
        while (rs.next()) {
        	Facture facture = new Facture();
        	facture.setNumFacture(rs.getInt("num_facture"));
        	facture.setDateFacture(rs.getDate("num_facture"));
        	facture.setIdClient(rs.getInt("id_client"));
            ls.add(facture);
        }
        return ls;
	}

	@Override
	public void update(Facture emp) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
}
