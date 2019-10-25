package dao;

import java.sql.Array;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import entities.Departement;
import entities.Role;

public class DaoRole {
	//methods;
		private String url = "jdbc:mysql://localhost:3306/gestionde";
		private String user = "root";
		private String password = "";
		private Connection conn = Connexion.Connect(url, user, password);
		// Create
		  public  int  addRole(Role role) {
			  int a = 0;
			   Statement st = null;
			   try {
				   
				 String statement = " INSERT INTO  role (permission)VALUES ('"+role.getPermission()+"')";
					st = conn.createStatement();
					
					a = st.executeUpdate(statement);
					
			   }catch(SQLException e ) {
				   e.getMessage();
			   }
			   
			  return a;
		  }
		  
		  // Read
		  public ArrayList<String> readRole() {
			  Statement st = null;
			  Role role = null;
			  ArrayList<String> perms = new ArrayList<String>();
			   try {
				   String statement = "SELECT * FROM role" ;
				   st = conn.createStatement();
				  ResultSet a = st.executeQuery(statement);
				   
				  if(a.next()) {
					  perms.add(a.getString("permission"));
				  }
			   } catch (SQLException e )
			   {
				   e.getMessage();
			   }
			return perms;
		  }
		  
		   // Delete
		  public int delDep(int id) {

			  int a = 0;
			   Statement st = null;
			   try {
				   
				 String statement = " DELETE FROM role WHERE id = "+id;
					st = conn.createStatement();
					
					a = st.executeUpdate(statement);
					
			   }catch(SQLException e ) {
				   e.getMessage();
			   }
			   
			  return a;
		  }

}
