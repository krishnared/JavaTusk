package com.corejava;

public class AbstractExample2 {
	public static void main(String[] args) {
		TeeShirt t1 = new TeeShirt();
		FormalShirt f1=new FormalShirt();
		show(t1); // Instead of calling each and every method... it is easy to call 
	show(f1);
	}

	public static void show(shirt s1) {
		// This is helpful.. if multiple classes have same type of information and print
		// using abstract
		s1.showcost();
		s1.clothdescription();//
	}
}

abstract class shirt {
	public abstract void showcost();

	public abstract void clothdescription();
}

class TeeShirt extends shirt {
	public void showcost() {
		System.out.println("Shirt cost is :" + 5599);
	}

	public void clothdescription() {
		System.out.println("Cloth is Lenin");
	}
}

 class FormalShirt extends shirt {
	public void showcost() {
		System.out.println("Shirt cost is :" + 6999);
	}
	public void clothdescription()
	{
		System.out.println("Hello");
	}
}