package com.java.concepts;

public class Overloading {

	private void name(String name) {
		System.out.println("Name is" + " " + name);
		
	}
	
	private void name(int age) {
		System.out.println("Age is" + " " + age);

	}

	private void name(float percentage) {
		System.out.println("percentage is" + " " + percentage);

	}
		

	public static void main(String[] args) {
		Overloading ol = new Overloading();
		ol.name("Lochana");
		ol.name(10);
		ol.name(98.27f);
		ol.name("Kavi");
		
	
	}
}
