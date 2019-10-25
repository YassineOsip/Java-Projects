package entities;

public class Admin extends Person {
	private String email;
	private String password;
	
	public Admin(String fname, String lname, int age, String email,String password) {
		super(fname, lname, age);
		this.email = email ;
		this.password = password;
		
	}
	//Getter/Setter

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [email=" + email + ", getFname()=" + getFname() + ", getLname()=" + getLname() + ", getAge()="
				+ getAge() + "]";
	}
	
	
	
	

}
