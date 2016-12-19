package com_qa_basics_General;
import java.sql.*;  
public class jdbccinsert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/sonoo?useSSL=false","root","hanshika18");  
		
			Statement stmt=con.createStatement();  
			stmt.executeUpdate("INSERT INTO emp " + 
	                "VALUES (5, 'Simpson', 45)");// insert row in the table
			ResultSet rs=stmt.executeQuery("select * from emp");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));   
			con.close();  
			}catch(Exception e){ System.out.println(e);}  

	}

}
