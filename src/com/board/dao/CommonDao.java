package com.board.dao;

import java.sql.*;

public class CommonDao {

		private final String driverName="oracle.jdbc.driver.OracleDriver";
	 
	    private final String url="jdbc:oracle:thin:@localhost:1521:XE";
	 
	    private final String db_id="system";
	 
	    private final String db_pw="5820";
	    	
	    private Connection con=null;
	    
	    private Statement stmt=null;

	    public Statement openConnection(){
	    	 
	        try{
	 
	            Class.forName(driverName);
	 
	            con=DriverManager.getConnection(url,db_id,db_pw);
	 
	            stmt=con.createStatement();
	 
	        }catch(Exception e){
	 
	            System.err.println("Oracle Database Connection Something Problem!!");
	 
	            System.out.println(e.getMessage());
	 
	            e.printStackTrace();
	 
	        }
	 
	        return stmt;
	 
	    }
	    public void closeConnection(){
	    	 
	        try {
	 
	            if(!con.isClosed())//닫히지 않았으면
	 
	                con.close();
	 
	        } catch (SQLException e) {
	 
	            e.printStackTrace();
	 
	        }
	 
	    }
}
