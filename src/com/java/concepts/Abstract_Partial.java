package com.java.concepts;

public class Abstract_Partial extends Partial{

	@Override
	public void fd() {
		System.out.println("fd rate of interest is 10");
		
	}
	
	public static void main(String[] args) {
		Abstract_Partial ap = new Abstract_Partial();
		ap.fd();
		ap.currentac();
		ap.savingac();
	}

}
