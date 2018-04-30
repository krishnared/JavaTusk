
public class AbstractClass {
    public static void main(String[] args) {

    }

    public void show() {
        System.out.println("Hello");
    }
}

abstract class Book {
    public abstract void index();

    public abstract void pages();

    public void lastpage() {
        System.out.println("Last page design Confirmed");
    }
}

class Rock extends Book {
    public void index() {
        System.out.println("Index page design Confirmed");
    }

    public void pages() {
        System.out.println("Pages design Confirmed");
    }
}
