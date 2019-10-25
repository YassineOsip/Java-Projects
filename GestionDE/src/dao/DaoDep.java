package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entities.Departement;

public class DaoDep {
	
	//methods;
	private String url = "jdbc:mysql://localhost:3306/gestionde";
	private String user = "root";
	private String password = "";
	private Connection conn = Connexion.Connect(url, user, password);
	// Create
	  public  int  addDep(Departement Dep) {
		  int a = 0;
		   Statement st = null;
		   try {
			   
			 String statement = " INSERT INTO  departement (depname,descr)VALUES ('"+Dep.getDepName()+"','"+Dep.getDescr()+"'"+")";
				st = conn.createStatement();
				
				a = st.executeUpdate(statement);
				
		   }catch(SQLException e ) {
			   e.getMessage();
		   }
		   
		  return a;
	  }
	  // Read
	  public Departement readDep(int id) {
		  Statement st = null;
		  Departement Dep = null;
		  
		   try {
			   String statement = "SELECT * FROM departement WHERE id =  " + id;
			   st = conn.createStatement();
			  ResultSet a = st.executeQuery(statement);
			   
			  if(a.next()) {
				  String depname = a.getString("depname");
				  String descr = a.getString("descr");
				  Dep = new Departement(depname,descr);
			  }
		   } catch (SQLException e )
		   {
			   e.getMessage();
		   }
		 
		return Dep;
	  }
	   // Delete Departement
	  public int delDep(int id) {

		  int a = 0;
		   Statement st = null;
		   try {
			   
			 String statement = " DELETE FROM departement WHERE id = "+id;
				st = conn.createStatement();
				
				a = st.executeUpdate(statement);
				
		   }catch(SQLException e ) {
			   e.getMessage();
		   }
		   
		  return a;
	  }
}
