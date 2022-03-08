package com.shopping.test;

import java.util.Iterator;
import java.util.List;

import com.shopping.dao.ClientDAO;
import com.shopping.dao.ClientDAOImpl;
import com.shopping.model.Client;
import com.shopping.util.ConnectionBd;

public class Test {
    public static void main(String[] args) {
    	
    	  try {

    		  ClientDAO cl=new ClientDAOImpl();
    		  Client client1 =cl.findById(80);
    		  client1.setNom("Boulman");
    		  cl.update(client1);
    		  System.out.println(client1.getId_client()+""+client1.getPrenom()+" "+client1.getNom());

    		  
    		  
    	    } catch (Exception e) {
    	      System.out.println("SQLException: " + e.getMessage());
    	    }
    }
}
