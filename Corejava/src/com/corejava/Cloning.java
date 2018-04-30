package com.corejava;

public class Cloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Krishna obj = new Krishna();
        obj.i = 5;
        obj.j = 6;
        Krishna obj1 = (Krishna) obj.clone();
        System.out.println(obj1);

    }
}

class Krishna {
    int i;
    int j;

    void show() {
        System.out.println("Hello World");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
