package model;

import java.time.*;

public class Dosen extends Pegawai {

	protected String officeHours;
	protected String position;
	
	public Dosen(String name, String address, String phone, String email, String office, Double salary,
			LocalDate recruitment, String officeHours, String position) {
		super(name, address, phone, email, office, salary, recruitment);
		this.officeHours = officeHours;
		this.position = position;
	}
	
	public Dosen() {
		
	}

	public String getOfficeHours() {
		return officeHours;
	}
	
	public void setOfficeHours() {
		System.out.print("Office Hours [**:** - **:**]: ");
		this.officeHours = sc.nextLine();
		if(!officeHours.matches("[0-9][\\d]:[\\d][\\d] - [\\d][\\d]:[\\d][\\d]")) {
			this.officeHours = "12:00 - 12:01";
		}
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition() {
		System.out.print("Academic Position: ");
		this.position = sc.nextLine();
	}
	
	public String toString() {
		return super.toString() +
				"\nOffice Hours     : " + officeHours +
				"\nAcademic Position: " + position
				+"\n";
	}
	
	

}
