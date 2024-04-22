package model;

public class Address {

	private String line1;
	private String city;
	private String state;
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", city=" + city + ", state=" + state + "]";
	}
	
	
	
}
