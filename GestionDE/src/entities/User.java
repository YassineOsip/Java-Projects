package entities;

public class User extends Person {
	
	private String email;
	private String password;
	
	
	public User(String fname, String lname, int age,String email,String password) {
		super(fname, lname, age);
		this.email = email;
		this.password = password;
	}
	
	
	//Getters-setters
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
		return "User [email=" + email + ", getFname()=" + getFname() + ", getLname()=" + getLname() + ", getAge()="
				+ getAge() + "]";
	}
	
	

}
