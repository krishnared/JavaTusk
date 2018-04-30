
public class Polymorphism {
    public static void main(String[] args) {
        Ab obj = new Ab();
        Ba obj1 = new Ba();
        /*
         * Ab a; a=obj1; obj1.show(); Dynamic Method Dispatcher It does'nt
         * matter which class the reference is, All it matters is, the instance
         */

    }
}

class Ab {
    public void show() { // Method Overriding
        System.out.println("In show A");
    }
}

class Ba extends Ab {

    public void show() {

        System.out.println("In show B");
    }
}
