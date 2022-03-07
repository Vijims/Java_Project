package com.java.concepts;

public class Girl_Overriding extends Boy_Overriding {
	
	@Override
	public void boyname() {
		super.boyname();
		System.out.println("Boy name is Karthi");
	}
	@Override
	public void boyage() {
		super.boyage();
	}
	
	@Override
	public void height(int i) {
		super.height(i);
		System.out.println("Karthi height is 6");
	}
	
    public static void main(String[] args) {
	 Girl_Overriding gi = new Girl_Overriding();
	 gi.boyname();
	 gi.boyage();
	 gi.height(5);
	 
}
}
