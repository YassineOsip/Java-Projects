package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import entities.User;

public class DaoUser {
	//methods;
			private String url = "jdbc:mysql://localhost:3306/gestionde";
			private String user = "root";
			private String password = "";
			private Connection conn = Connexion.Connect(url, user, password);
			// Create
			  public  int  addUser(User user) {
				  int a = 0;
				   Statement st = null;
				   try {
					   
					 String statement = " INSERT INTO  user (fname,lname,age,email,password)VALUES ('"+user.getFname()+"','"+user.getLname()+"',"+ user.getAge()+",'"+user.getEmail()+"','"+user.getPassword()+"')";
						st = conn.createStatement();
						
						a = st.executeUpdate(statement);
						
				   }catch(SQLException e ) {
					   e.getMessage();
				   }
				   
				  return a;
			  }
			  // Readuser
			  public User readUser(int id) {
				  Statement st = null;
				  User user = null;
				  
				   try {
					   String statement = "SELECT * FROM user WHERE id =  " + id;
					   st = conn.createStatement();
					  ResultSet a = st.executeQuery(statement);
					   
					  if(a.next()) {
						  String fname = a.getString("fname");
						  String lname = a.getString("lname");
						  int age = a.getInt("age");
						  String email = a.getString("email");
						  String password = a.getString("password");
						  user = new User(fname,lname,age,email,password);
					  }
				   } catch (SQLException e )
				   {
					   e.getMessage();
				   }
				 
				return user;
			  }
			   // Delete user
			  public int delUser(int id) {

				  int a = 0;
				   Statement st = null;
				   try {
					   
					 String statement = " DELETE FROM user WHERE id = "+id;
						st = conn.createStatement();
						
						a = st.executeUpdate(statement);
						
				   }catch(SQLException e ) {
					   e.getMessage();
				   }
				   
				  return a;
			  }

}
