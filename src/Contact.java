
public class Contact {
	
	String name;
	int number;
	String address;

	public Contact() {
		
	
	}
	public Contact(String name, int number, String address) {
	
		this.name = name;
		this.number = number;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
