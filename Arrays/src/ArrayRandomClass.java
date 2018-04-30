import java.util.Random;

public class ArrayRandomClass {
    public static void main(String[] args) {
        Random r = new Random();
        int a[] = new int[20];

         for(int i=0;i<a.length;i++)
         {
             a[i]=r.nextInt(50);
         }
         System.out.println("Printing 20 randomn values under ranging from 0 to 50");
        for (int c : a) {
            System.out.println(c);
        }

    }
}
