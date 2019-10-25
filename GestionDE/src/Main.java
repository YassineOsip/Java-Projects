import java.util.ArrayList;

import dao.DaoAdmin;
import dao.DaoDep;
import dao.DaoEmp;
import dao.DaoRole;
import dao.DaoUser;
import entities.Admin;
import entities.Departement;
import entities.Employee;
import entities.Role;
import entities.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Departement d1 = new Departement("IT", " informatique");
		Employee e1 = new Employee("yassin", "lfkih", 10, "A121415", d1);
		DaoEmp gemp = new DaoEmp();
		DaoDep gdep = new DaoDep();
		DaoAdmin gdadmin = new DaoAdmin();
//		Admin SuperAdmin = new Admin("fek","lke",19,"dee","jknj");
		//gdadmin.addAdmin(SuperAdmin);
		//Admin adp=  gdadmin.readadmin(1);
//		System.out.println(adp);
//		int a = gdadmin.deladmin(2);
//		System.out.println(a);
		
		//gemp.addEmp(e1);
		//Employee ecopy1 = gemp.readEmp(1, d1);
		//System.out.println(ecopy1);
		//int a= gemp.delEmp(8);
		//int a = gdep.addDep(d1);
		//System.out.println(a);
		//Departement a = gdep.readDep(1);
		//System.out.println(a);
		//int a = gdep.delDep(1);
//		DaoUser u = new DaoUser();
//		User u1 = new User("ali","hery",23,"fds","123");
//		
//		//u.addUser(u1);
//		User u2 = u.readUser(1);
//		System.out.println(u2);
//		u.delUser(2);
		
		DaoRole grole = new DaoRole();
		Role admin = new Role("admin");
		Role user = new Role("user");
		
		//int a = grole.addRole(admin);
		//int b = grole.addRole(user);
		
		//System.out.println(a);
		//System.out.println(b);
		
		ArrayList<String> permss = grole.readRole();
		for(int a=0;a<permss.size();a++) {
			System.out.println(permss.get(a));
		}

		
		
		
	}

}
