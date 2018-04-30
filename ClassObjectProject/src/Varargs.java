
public class Varargs {
    public static void main(String[] args) {
        Display obj = new Display();
        obj.show(3);
        obj.show(2, 3, 45, 65);
    }
}

class Display {
    public void show(int a) {
        System.out.println("Hello Hi");
    }

    // If the parameter is exactly given as same as the method parameters,

    public void show(int... a) // Varargs
    {
        System.out.println("Varargs takes parameters in array ");
        for (int i : a) {
            System.out.println(i);
        }
    }
}
 