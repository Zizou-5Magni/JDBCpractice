package com.safwat.mohammed.jdbc;

public class JdbcInsertExample {
	public static void main(String[] args) {
		//load and register the jdbc into memory
		//One way to do it is:
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Unfound Driver..");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}//end of main

}
