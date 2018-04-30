
public class Static {
    public static void main(String[] args) {
        // Abc obj = new Abc();
        // obj.i = 5;
        // obj.rock();
        /*
         * Static is a key word, whenever we use a static before to the variable
         * or method, that variable or method is accesed with out creating an
         * object
         */

        Abc.i = 5;
        // Abc.b; will return the error because,
    }
}

class Abc {
    static int i;
    int b;

    public static void rock() {
        System.out.println("Printing Rock");

    }

}

class Bbq {
    static int a;

    public void eree() {
        System.out.println(a);
    }

    public static void era() {
        System.out.println(a);
    }
}
