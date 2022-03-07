package com.java.concepts;

public class Interface implements Fully, Inter {
 @Override
public void bank() {
System.out.println("HDFC");
	
}
 @Override
	public void bank1() {
	 System.out.println("PNB");
		
	}
 @Override
	public void bank2() {
	 System.out.println("SBI");

		
	}
 
 
 @Override
	public void blue() {
	 System.out.println("blue colour");
	
		
	}
 @Override
	public void green() {
	System.out.println("green colour");
		
	}

 public static void main(String[] args) {
	Interface i = new Interface();
	i.bank();
	i.bank1();
	i.bank2();
	i.blue();
	i.green();
			
}
 
	
}

