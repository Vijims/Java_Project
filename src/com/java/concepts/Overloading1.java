package com.java.concepts;

public class Overloading1 {
	private void student(String Name, String initial, int age, float percentage) {
		System.out.println(Name + " " + initial + "," + age + "," + percentage);

	}
	public static void main(String[] args) {
		Overloading1 od = new Overloading1();
		od.student("Lochana", "C V", 10, 98.02f);
	}
}
