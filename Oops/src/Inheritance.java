
public class Inheritance {
    public static void main(String[] args) {
        A obj = new C();
        obj.add();
        obj.sub(2, 3);

    }
}

class A { // Parent Class

    public void add() {

        System.out.println("In Add method");

    }

    public void sub() {
        System.out.println("In A class");
    }

    public void sub(int a, int b) {
        System.out.println(a * b);
    }
}

// A->B
class B extends A { // Single Level Inheritance
    int r;
    int p;
    int q;

    public void run() {
        System.out.println("Run method in B class");
    }

    public void sub() {
        System.out.println("In B class");
    }
}

// A->B->C
class C extends B { // Multi Level Inheritance
    int l = r * p * q;

    public void sub() {
        System.out.println("In C class");
    }
}

class E extends A { // Heirarichal Inheritance
    public void ramp() {
        System.out.println("Inside ramp class ");
    }
}

class F extends A { // Heirarichal Inheritance

    public void bamp() {
        System.out.println("Insided bamp class");
    }
}
