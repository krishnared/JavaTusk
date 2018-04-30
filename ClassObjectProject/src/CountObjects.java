
public class CountObjects {
    // Important for Interview
    public static void main(String[] args) {

        Abc1 obj = new Abc1();
        Abc1 obj1 = new Abc1();
        Abc1 obj2 = new Abc1();
        obj1.counter();
    }
}

class Abc1 {
    static int i;

    public Abc1() {
        i++;
    }

    public void counter() {
        System.out.println(i);
    }
}
