package com.shopping.util;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class ConnectionBd {
	
	 private static Connection con = null;
	    static
	    {
	        String url = "jdbc:mysql://localhost:3306/shopping";
	        String user = "root";
	        String pass = "";
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            con = DriverManager.getConnection(url, user, pass);
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public static Connection getCnx() {
			return con;
		}
	    
		public static void discconnect(){
			try{
				con.close();
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "Log out impossible","Message d’avertissement", JOptionPane.ERROR_MESSAGE);
			}
	    }
	   
}
