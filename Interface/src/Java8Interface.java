
public class Java8Interface {
    public static void main(String[] args) {

        Abc obj = () -> { // Lamda Expression
            System.out.println("Java 8 lamda expression");
        };
        obj.show();

    }
}

interface Abc {

    void show();

}
