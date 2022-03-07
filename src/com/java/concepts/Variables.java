package com.java.concepts;

public class Variables {

	public static int a = 20;
	
	private void mobile() {
		int i = 10;
		System.out.println(i);
		System.out.println(a);
	

	}
	private void mobile1() {
	     System.out.println("Local variables");

	}
	
	
	public static void main(String[] args) {
		Variables va = new Variables();
		va.mobile();
		va.mobile1();
		System.out.println(a);
		
	}

	}

