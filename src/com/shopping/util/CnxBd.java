package com.shopping.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class CnxBd {
	
	 private static Connection con = null;
	    static
	    {
	        String url = "jdbc:mysql://localhost:3306/bd_shopping";
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
	    public static Connection getConnection() {
	        return con;
	    }

}
