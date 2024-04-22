package model;

public class Student {

	private int roll;
    private String sname;
    private Address add;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", sname=" + sname + ", add=" + add + "]";
	}
    
    
}
