package entities;

public class Departement {
	//ATTRIBUTES
	private String depName;
	private String descr;

	//CONSTRUCTOR
	public Departement(String depName, String descr) {
		this.depName = depName;
		this.descr = descr;
	}
	
	//SETTERS_GETTERS
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}

	@Override
	public String toString() {
		return "Departement [depName=" + depName + ", descr=" + descr + ", getDepName()=" + getDepName()
				+ ", getDescr()=" + getDescr() + "]";
	}
	
}
