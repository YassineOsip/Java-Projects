package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entities.Departement;
import entities.Employee;

public class DaoEmp {
	
	//methods;
	private String url = "jdbc:mysql://localhost:3306/gestionde";
	private String user = "root";
	private String password = "";
	private Connection conn = Connexion.Connect(url, user, password);
	// Create
	  public  int  addEmp(Employee emp) {
		  
		  int a = 0;
		   Statement st = null;
		   try {
			   
			 String statement = " INSERT INTO  employee ( fname, lname, age,ref)VALUES ('"+emp.getFname()+"','"+emp.getLname()+"',"+emp.getAge()+",'"+emp.getRef()+"');";
				st = conn.createStatement();
				
				a = st.executeUpdate(statement);
				
		   }catch(SQLException e ) {
			   e.getMessage();
		   }
		   
		  return a;
	  }
	  // Read
	  public Employee readEmp(int id,Departement dep) {
		  Statement st = null;
		  Employee emp = null;
		  
		   try {
			   String statement = "SELECT * FROM employee WHERE id =  " + id;
			   st = conn.createStatement();
			  ResultSet a = st.executeQuery(statement);
			   
			  if(a.next()) {
				  String fname = a.getString("fname");
				  String lname = a.getString("lname");
				  int age = a.getInt("age");
				  String ref = a.getString("ref");
				  emp = new Employee(fname, lname, age, ref, dep);
			  }
		   } catch (SQLException e )
		   {
			   e.getMessage();
		   }
		 
		return emp;
	  }
	   // Delete employee
	  public int delEmp(int id) {

		  int a = 0;
		   Statement st = null;
		   try {
			   
			 String statement = " DELETE FROM  employee WHERE id = "+id;
				st = conn.createStatement();
				
				a = st.executeUpdate(statement);
				
		   }catch(SQLException e ) {
			   e.getMessage();
		   }
		   
		  return a;
	  }
	  

}
