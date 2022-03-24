package com.safwat.mohammed.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsertExample {
	public static void main(String[] args) {
		//load and register the jdbc into memory
		//One way to do it is:
		//NEW version of Java already implements this automatically load,
		// the Driver file, thus this is only for learning purposes:
		
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			System.out.println("Unfound Driver..");
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		//Decalring variables to establish a connection
		String url = "jdbc:mysql://localhost:3306/test";	//url to connect to DB
		String username = "root";
		String password = "ahmedAk88*";	// DElETE later: passwords should NOT be hardcoded into the program.
		String insertCommand = "INSERT INTO employee VALUES(101, 'Mike', 'Instructor')";
		int i = 0; //To store the execute and update method
		Connection cn = null;	//import from java.sql package
		Statement st = null;	//import from java.sql package
		
		try {
			cn = DriverManager.getConnection(url,username,password);	//loads jdbc driver into memory to connects to db
			st = cn.createStatement();	//method used to execute sql commands
			i = st.executeUpdate(insertCommand);	//method used to execute sql commands
			System.out.println(i + "record(s) added..");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}//end of main

}
