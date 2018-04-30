
public class Constructor {

    public static void main(String[] args) {

        // A obj = new A(); // A() is a constructor
        A obj = new A(2, 3);

        System.out.println("Second Statment");
        System.out.println(obj.c);

    }
}

class A {
    int a;
    int c;

    public A() { // Default Constructor
        System.out.println("First Statement");
    }

    public A(int a, int b) // Parameterized Constructor
    {
        System.out.println("First Statement");
        int c = a * b;
        System.out.println(c);
        this.c = c;
    }
}
