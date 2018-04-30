package com.corejava;

public class ReferencingAnotherClass {

public static void main(String[] args)
{
	krishnareddy obj=new khambam();
	obj.show();

}
}

class krishnareddy
{
	static int i=3;
	static int j=4;
	public void show()
	{
	int k=i*j;
	System.out.println(k);
	System.out.println("Hello World");
	}
}
class khambam extends krishnareddy
{
	static int z=3;
	static int q=4;
	public void angular()
	{
		System.out.println("Universe");
		System.out.println("Testing");
	}

}
/*abstract class Bike{
abstract void run();
}

class Honda4 extends Bike{
void run(){System.out.println("running safely..");}

public static void main(String args[]){
Bike obj = new Honda4();
obj.run();
}
}*/
