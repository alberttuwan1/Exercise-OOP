package model;

import java.util.*;

public class Persona {
	
	Scanner sc = new Scanner(System.in);
	
	protected String name;
	protected String address;
	protected String phone;
	protected String email;
	
	public Persona(String name, String address, String phone, String email) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public Persona() {
		
	}

	public String getName() {
		return name;
	}

	public void setName() {
		System.out.print("Name: ");
		this.name = sc.nextLine();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress() {
		System.out.print("Address: ");
		this.address = sc.nextLine();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone() {
		String phone;
		do {
			System.out.print("Phone [Starts with \"08\" Or \"628\" And has 11-14 digit]: ");
			phone = sc.nextLine();
		}while(!phone.startsWith("08") &&
				!phone.startsWith("628") &&
				(phone.length() < 11 ||
				phone.length() > 14));
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail() {
		String email;
		do {
			System.out.print("Email [Ends with \"@gmail.com\" Or \"@outlook.com\"]: ");
			email = sc.nextLine();
		}while(!email.matches(".*.@gmail.com$") &&
				!email.matches(".*.@outlook.com$"));
		this.email = email;
	}
	
	@Override
	public String toString() {
		return 	"\nClass            : " + this.getClass().getSimpleName() +
				"\nNama             : " + name + 
				"\nAddress          : " + address +
				"\nPhone number     : " + phone +
				"\nEmail Address    : " + email;
	}
	
}
