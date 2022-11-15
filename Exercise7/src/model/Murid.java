package model;

public class Murid extends Persona {

	protected final String status;
	public Murid(String name, String address, String phone, String email, String status) {
		super(name, address, phone, email);
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"\nStatus           : " + status
				+"\n";
	}
}
