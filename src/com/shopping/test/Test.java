package com.shopping.test;

import com.shopping.util.ConnectionBd;

public class Test {
    public static void main(String[] args) {
    	
    	  try {
    		  ConnectionBd.getCnx();
    		  
    	    } catch (Exception e) {
    	      System.out.println("SQLException: " + e.getMessage());
    	    }
    }
}
