package com.java.concepts;

public class Day3 extends Day2 {

	@Override
	public void name() {
		super.name();
	}
	
	@Override
	public void name1() {

		super.name1();
	}
	
	private void name4() {
		System.out.println("Student name is Kavi");

	}
	
	private void age1() {
		System.out.println("Kavi age is 18");

	}
	
	public static void main(String[] args) {
		Day3 d3 = new Day3();

		d3.name4();
		d3.age1();
		d3.name();
		d3.name1();
		d3.name2();
		d3.age();
		
		
	}
}
  