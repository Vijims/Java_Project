package com.java.concepts;

public class Boy_Overriding {
    public void boyname() {
	System.out.println("Boy name is Hari");

}
    public void boyage() {
		System.out.println("Hari age is 19");

	}
    public void height(int i) {
		System.out.println("Hari height is" + " " + i);

	}
    public static void main(String[] args) {
		Boy_Overriding bo = new Girl_Overriding();
		// parentclass name = new childclass name (upcasting)
		bo.boyage();
		bo.boyname();
		bo.height(5);
	}
}
