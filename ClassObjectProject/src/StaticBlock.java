
public class StaticBlock {
    static {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        System.out.println("In the main method");
        B obj = new B();
    }

    static {
        System.out.println("Second Executed");
    }
}

class B {
    static {
        System.out.println("In the B block");
    }

}
/*
 * Static Block is a block which executes when a class is loaded into the JVM It
 * is Executed before the main method. 
 */
