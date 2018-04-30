
public class InterfaceBasic {
    public static void main(String[] args) {
        puma obj = new raj();
        obj.color();
        obj.show();
        obj.display();
    }
}

interface puma {
    public void show();

    public void display();

    public void color();

}

class raj implements puma {
    public void show() {
        System.out.println("Hello");
    }

    public void display() {
        System.out.println("Hello");
    }

    public void color() {
        System.out.println("Hello");
    }

    public void raa() {
        System.out.println("Hello");
    }

}
