package com.corejava;

public class InterfaceTest {
    public static void main(String[] args) {

        Passporta obj = new Airport();
        obj.name();
        // To

    }
}

abstract class Passporta {
    public void name() {
        System.out.println(" name Working");
    }

    public void id() {
        System.out.println(" id Working");
    }

    public abstract void scan();
}

class Airport extends Passporta {
    public void iduo() {
        System.out.println(" id Working");
    }

    public void scan() {

    }
}

interface Ambiga {
    public default void araada() {
        System.out.println("Hello");

    }
    public void raaga();
    public void ramaraj();
    
}
