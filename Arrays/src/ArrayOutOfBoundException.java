
public class ArrayOutOfBoundException {
    public static void main(String[] args) {

        int a[] = new int[3];
        a[1] = 2;
        a[2] = 3;
        // If the value is empty then the value is returned 0

        System.out.println(a[0]);
        try {
            System.out.println(a[3]);
        } catch (Exception e) {
            System.out.println("Array out of bound exception using exception ");
        }
    }
}
