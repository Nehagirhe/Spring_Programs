package model;

public class Employee {

	private int id;
	private String ename;
	private Address add1;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Address getAdd1() {
		return add1;
	}
	public void setAdd1(Address add1) {
		this.add1 = add1;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", add1=" + add1 + "]";
	}
	
}
