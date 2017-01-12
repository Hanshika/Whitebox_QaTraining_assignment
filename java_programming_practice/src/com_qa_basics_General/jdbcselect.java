package com_qa_basics_General;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcselect {

	
	 
	public static void main(String[] args) {
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/sonoo?useSSL=false","root","hanshika18");  
		
			Statement stmt=con.createStatement();  
			String sql ="select * from emp";
			ResultSet rs =stmt.executeQuery("select name from emp where id in(4,3)");
			 while(rs.next()) 
			 {
				  String lastName = rs.getString("name");
				  System.out.println(lastName + "\n");
				}
rs.close();
		}catch(Exception e){ System.out.println(e);}  	
			

	}

}
