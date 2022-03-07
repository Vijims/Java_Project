package com.java.concepts;

import java.util.Scanner;

public class Scanner_concept {
	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		
		String name = Sc.nextLine();
		System.out.println("Name is" + " " + name);
		
		String Gender = Sc.nextLine();
		System.out.println("Gender is" + " " + Gender);
		
		long mobile_number = Sc.nextLong();
		System.out.println("mobile number is" + " " + mobile_number);
		
		
		
	}
	
}

