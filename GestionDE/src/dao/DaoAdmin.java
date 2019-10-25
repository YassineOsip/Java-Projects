package dao;
import entities.Admin;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entities.Admin;
import entities.Departement;

public class DaoAdmin {
    
	//methods;
		private String url = "jdbc:mysql://localhost:3306/gestionde";
		private String user = "root";
		private String password = "";
		private Connection conn = Connexion.Connect(url, user, password);
		// Create
		  public  int  addAdmin(Admin ad) {
			  int a = 0;
			   Statement st = null;
			   try {
				   
				 String statement = " INSERT INTO  admin (fname,lname,age,email,password)VALUES ('"+ad.getFname()+"','"+ad.getLname()+"',"+ ad.getAge()+",'"+ad.getEmail()+"','"+ad.getPassword()+"')";
					st = conn.createStatement();
					
					a = st.executeUpdate(statement);
					
			   }catch(SQLException e ) {
				   e.getMessage();
			   }
			   
			  return a;
		  }
		  // Read
		  public Admin readadmin(int id) {
			  Statement st = null;
			  Admin ad = null;
			  
			   try {
				   String statement = "SELECT * FROM admin WHERE id =  " + id;
				   st = conn.createStatement();
				  ResultSet a = st.executeQuery(statement);
				   
				  if(a.next()) {
					  String fname = a.getString("fname");
					  String lname = a.getString("lname");
					  int age = a.getInt("age");
					  String email = a.getString("email");
					  String password = a.getString("password");
					  ad = new Admin(fname,lname,age,email,password);
				  }
			   } catch (SQLException e )
			   {
				   e.getMessage();
			   }
			 
			return ad;
		  }
		   // Delete Admin
		  public int deladmin(int id) {

			  int a = 0;
			   Statement st = null;
			   try {
				   
				 String statement = " DELETE FROM admin WHERE id = "+id;
					st = conn.createStatement();
					if(id != 1) {
					a = st.executeUpdate(statement);
					}
			   }catch(SQLException e ) {
				   e.getMessage();
			   }
			   
			  return a;
		  }
}
