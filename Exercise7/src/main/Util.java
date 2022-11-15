package main;

import java.util.*;

public class Util {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void cls() {
		for (int i = 0; i < 40; i++) {
			System.out.println("");
		}
	}
	
	public static void enter() {
		System.out.print("Press Enter to Continue");
		scan.nextLine();
	}
	
	static void temp() {
		
	}
	
	public static void limit() {
		for (int i = 0; i < 40; i++) {
			System.out.print("=");
		}
		System.out.println("");
	}
	
	
}
