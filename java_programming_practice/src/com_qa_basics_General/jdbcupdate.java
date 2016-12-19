package com_qa_basics_General;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcupdate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/sonoo?useSSL=false","root","hanshika18");  
		
			Statement stmt=con.createStatement();  
			String sql="UPDATE emp " +
	                   "SET age = 35 WHERE id in (2)";
			stmt.executeUpdate(sql);
			sql="select id,name,age from emp";
			 ResultSet rs = stmt.executeQuery(sql);
			  
				 while(rs.next())  
						System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));   
						con.close();  
rs.close();
		}catch(Exception e){ System.out.println(e);}  
	}

}
