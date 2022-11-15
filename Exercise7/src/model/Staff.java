package model;

import java.time.*;

public class Staff extends Pegawai {

	protected String title;
	public Staff(String name, String address, String phone, String email, String office, Double salary,
			LocalDate recruitment, String title) {
		super(name, address, phone, email, office, salary, recruitment);
		this.title = title;
	}
	
	public Staff() {
		
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle() {
		System.out.print("Title: ");
		this.title = sc.nextLine();
	}
	
	public String toString() {
		return super.toString() +
		"\nTitle            : " + title
		+"\n";
	}

}
