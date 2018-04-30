package com.corejava;

public class InterfaceFunctional {
    public static void main(String[] args) {
        // Interface Declaration and object creation
        Africa obj = new B();
        obj.show();

        // Functional Interface
        Africa obj2 = () -> System.out.println("How are you?");
        obj2.show();
    }
}

interface Africa
// Single Abstract Method
{
    public abstract void show();

}

class B implements Africa {
    public void show() {
        System.out.print("Hello World");
    }
}
