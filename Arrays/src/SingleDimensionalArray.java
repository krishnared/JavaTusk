
public class SingleDimensionalArray {
    public static void main(String[] args) {
        // Because Array is an object in java, So we use instantiate the
        int a[] = new int[4]; // Single Dimensional Array Declartion
        a[0] = 1; // Inserting values in the Array
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;

        int b[] = { 2, 3, 4 };
        int c[] = new int[4];
        c[0] = 1;
        c[1] = 2;
        c[2] = 3;
        c[3] = 4;

        System.out.println("The First element in the array is " + a[0]);
        System.out.println("The elements in the order using print statement");
        for (int i = 0; i < 4; i++) {

            System.out.print(a[i]);

        }
        System.out.println(" ");
        // Enhanced For loop
        System.out.println("enhanced for loop values");
        for (int arc : a) {

            System.out.println(arc);
        }

        for (int valus : b) {
            System.out.println("Printing b valus  " + valus);
        }

        System.out.println();

        for (int val : c) {
            System.out.println("Printing C values  " + val);
        }
    }
}
