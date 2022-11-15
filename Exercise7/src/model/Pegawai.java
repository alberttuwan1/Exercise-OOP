package model;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Pegawai extends Persona {

	
	protected String office;
	protected Double salary;
	protected LocalDate recruitment;
	public Pegawai(String name, String address, String phone, String email, String office, Double salary, LocalDate recruitment) {
		super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
		this.recruitment = recruitment;
	}
	
	public Pegawai() {
		
	}

	public String getOffice() {
		return office;
	}


	public void setOffice() {
		System.out.print("Office: ");
		this.office = sc.nextLine();
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary() {
		System.out.print("Salary: ");
		double salary;
		try {
			salary = sc.nextDouble();
			if(salary < 3000000.0) {
				salary = 3000000.0;
			}
		} catch (Exception e) {
			salary = 3000000.0;
		}
		sc.nextLine();
		this.salary = salary;
	}


	public LocalDate getRecruitment() {
		return recruitment;
	}


	public void setRecruitment() {
		System.out.print("Recruitment Date [dd-MM-yyyy]: ");
		try {
			this.recruitment = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		} catch (Exception e) {
			this.recruitment = LocalDate.parse("01-01-2000", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		}
	}

	@Override
	public String toString() {
		return super.toString() +
				"\nAddress          : " + address +
				"\noffice           : " + office +
				"\nsalary           : " + salary +
				"\nRecruitment date : " + DateTimeFormatter.ofPattern("dd-MMMM-yyyy").format(recruitment);
	}

}
