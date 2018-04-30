
public class Super {
    public static void main(String[] args) {

        Bat obj = new Bat();
        /*
          When the object is created, By default the construcor is called and
          every constructor has Super keyword, which will call the super class
          and call the constructor.
         */
        
        Mat obj1=new Mat();
        obj1.print(); //This will print the super class "i" Value
    }
}

class Aaat {
    
    public Aaat() {
        //Super(); 
        System.out.println("Constructor A");
    }

    public void show() {
        System.out.println("Hello");
    }
}

class Bat extends Aaat {
    int i=5;
    public Bat() {
       // super();
        System.out.println("B constructor");
    }
    public void ak()
    {
        System.out.println("Bat class Method value");
    }

}

class Mat extends Bat
{
    int i=4;
    public void print() {
    super.ak();
        System.out.println(super.i);
    }
}