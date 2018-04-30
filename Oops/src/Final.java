
public class Final {
    // Final keyword can be used with the
    // Class, Variable, Method
    public static void main(String[] args) {

        A obj = new A();

    }

}

class Aart {
    final int a = 5;
    // The variable cannot be changed

    final public void show() {
        // The method cannot be overriden in the sub classes
        System.out.println(a);
    }
}

class Bart extends Aart {
    // final public void show() {
    // Cannot be over riden
    // }
}

final class Caart {
    // This class cannot be inherted but , this class can inherit
}
