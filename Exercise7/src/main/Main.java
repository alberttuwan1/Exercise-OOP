package main;

import java.util.*;
import model.*;

public class Main {

	Scanner sc = new Scanner(System.in);
	
	ArrayList<Murid> murid = new ArrayList<>();
	ArrayList<Dosen> dosen = new ArrayList<>();
	ArrayList<Staff> staff = new ArrayList<>();
	
	void addMurid() {
		Persona temp = new Persona();
		String status;
		
		System.out.println("Menu: Add Murid");
		
		temp.setName();
		temp.setAddress();
		temp.setPhone();
		temp.setEmail();
		
		do {
			System.out.print("Status [Freshman | Sophomore | Junior | Senior]: ");
			status = sc.nextLine();
		} while (!status.equals("Freshman") &&
				!status.equals("Sophomore") &&
				!status.equals("Junior") &&
				!status.equals("Senior"));
		
		murid.add(new Murid(temp.getName(), temp.getAddress(), 
				temp.getPhone(), temp.getEmail(), 
				status));
		System.out.println("New Murid Successfully Added");
		Util.enter();
	}
	
	void addDosen() {
		Dosen temp = new Dosen();
		System.out.println("Menu: Add Dosen");

		temp.setName();
		temp.setAddress();
		temp.setPhone();
		temp.setEmail();
		temp.setOffice();
		temp.setSalary();
		temp.setRecruitment();
		temp.setOfficeHours();
		temp.setPosition();
		
		dosen.add(new Dosen(temp.getName(), temp.getAddress(), 
				temp.getPhone(), temp.getEmail(), 
				temp.getOffice(), temp.getSalary(),
				temp.getRecruitment(),  temp.getOfficeHours(),
				temp.getPosition()));
		System.out.println("New Dosen Successfully Added");
		Util.enter();
	}
	
	void addStaff() {
		Staff temp = new Staff();
		System.out.println("Menu: Add Dosen");

		temp.setName();
		temp.setAddress();
		temp.setPhone();
		temp.setEmail();
		temp.setOffice();
		temp.setSalary();
		temp.setRecruitment();
		temp.setTitle();
		staff.add(new Staff(temp.getName(), temp.getAddress(), 
				temp.getPhone(), temp.getEmail(), 
				temp.getOffice(), temp.getSalary(),
				temp.getRecruitment(), temp.getTitle()));
		
		System.out.println("New Staff Successfully Added");
		Util.enter();
	}
	
	void viewData() {
		System.out.println("#Murid Data#");
		if(murid.isEmpty()) {
			System.out.print("No Murid Data");
		}else {
			int i = 1;
			for (Murid murid2 : murid) {
				System.out.println("#"+ (i++));
				System.out.println(murid2.toString());
			}
		}
		Util.limit();
		
		System.out.println("#Dosen Data#");
		if(dosen.isEmpty()) {
			System.out.println("No Dosen Data");
		}else {
			int i = 1;
			for (Dosen dosen2 : dosen) {
				System.out.print("#"+ (i++));
				System.out.println(dosen2.toString());
			}
		}
		Util.limit();
		
		System.out.println("#Staff Data#");
		if(staff.isEmpty()) {
			System.out.println("No Staff Data");
		}else {
			int i = 1;
			for (Staff staff2 : staff) {
				System.out.print("#"+ (i++));
				System.out.println(staff2.toString());
			}
		}
		Util.limit();
		Util.enter();
	}

	public Main() {
		
		int inp, choice;
		do {
			inp = mainMenu();
			
			switch (inp) {
			case 1:
				choice = addData();
				
				switch(choice) {
					case 1:
						addMurid();
						break;
					case 2:
						addDosen();
						break;
					case 3:
						addStaff();
						break;
				}
				Util.cls();
				break;
			case 2:
				viewData();
				break;
			}
			Util.cls();
		} while (inp == 1 || inp == 2);
	}

	public static void main(String[] args) {
		new Main();

	}
	
	int addData() {
		int inp;
		do {
			System.out.println("Welcome to Add Data Menu\n"
					+ "1. Add Murid\n"
					+ "2. Add Dosen\n"
					+ "3. Add Staff\n"
					+ "4. Back to Main Menu");
			inp = intInp();
			Util.cls();
		} while (inp < 1 || inp > 4);
		return inp;
	}
	
	int mainMenu() {
		int inp;
		do {
			System.out.println("Welcome to Main Menu\n"
					+ "1. Add Data\n"
					+ "2. View Data\n"
					+ "3. Exit");
			inp = intInp();
			Util.cls();
		} while (inp < 1 || inp > 3);
		return inp;
	}
	
	int intInp() {
		int inp;
		try {
			inp = sc.nextInt();
		}catch(Exception e) {
			inp = -1;
		}
		sc.nextLine();
		return inp;
	}
	

}
