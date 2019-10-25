package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
	
	public static Connection Connect(String url, String user,String passwd) {
			Connection conn = null;
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			conn = DriverManager.getConnection(url,user,passwd);
			System.out.println("conn OK");
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return conn;
	}
	
	public static boolean Close(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
		
	}
}