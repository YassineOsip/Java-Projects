package entities;

public class Employee extends Person{
	//Attr
	private String ref;
	private Departement dep;
	
	//Constr
	public Employee( String fname, String lname, int age,String ref,Departement dep) {
		super(fname, lname, age);
		this.dep = dep;
		this.ref = ref;
	}

	//get_set
	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public Departement getDep() {
		return dep;
	}

	public void setDep(Departement dep) {
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "Employee [ref=" + ref + ", dep=" + dep + ", getRef()=" + getRef() + ", getDep()=" + getDep()
				+ ", getFname()=" + getFname() + ", getLname()=" + getLname() + ", getAge()=" + getAge() + "]";
	}

	








	
	

}
