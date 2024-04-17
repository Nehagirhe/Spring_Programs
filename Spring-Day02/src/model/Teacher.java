package model;

public class Teacher {
private String name;
private String subject;
private Address add;

/*public Teacher() {
	super();
	// TODO Auto-generated constructor stub
}
public Teacher(String name, String subject, Address add) {
	super();
	this.name = name;
	this.subject = subject;
	this.add = add;
}*/
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public Address getAdd() {
	return add;
}
public void setAdd(Address add) {
	this.add = add;
}

@Override
public String toString() {
	return "Teacher [name=" + name + ", subject=" + subject + ", address=" + add + "]";
}

}
