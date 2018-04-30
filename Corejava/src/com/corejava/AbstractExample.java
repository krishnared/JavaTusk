package com.corejava;

public class AbstractExample {

	/*
	 * Read this : Usually company managers declare all the methods as abstract in
	 * the class and give it to clinet. They describe the functionality of method
	 * and hand over it to clients.
	 */
	public static void main(String[] args) {
		JallaPhone obj = new JallaPhone();
		obj.AutoCharge();
		obj.AutoReply();
		obj.Music();
	}

}

abstract class KrishnaPhone {

	public void Music() // Abstract Methods cannot define the method.
	{
		System.out.println("Music is working");
	}
	

	public abstract void AutoCharge(); // If you cannot define method. Then declare the method as abstract.

	public abstract void AutoReply();
}

class JallaPhone extends KrishnaPhone {
	public void AutoCharge() // When you extend the class and define the method. You cannot use abstract to
								// it.
	{
		System.out.println("Charging");
	}

	public  void AutoReply() {
	    System.out.println("Working");
	}
}
