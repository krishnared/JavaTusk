
public class TwoDimensionalArray {
    // For two dimensional Array, the values should same type and same length
    public static void main(String[] args) {
        // int a[] = new int[5];
        // int b[] = new int[6];
        // int p[][]=new int p[rows][colums]
        int p[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        // Array of Arrays Declaration
        System.out.println("The value of first row second element is " + p[0][1]);
        System.out.println("Normal For loop");
        for (int i = 0; i < 3; i++) { // Here i < 3 is the number of rows

            for (int j = 0; j < 4; j++) { // Here J < 4 is the number of colums

                System.out.print(p[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Enhanced For Loop");
        // Enhanced for loop always takes the value inside the arrays
        // Enhanced for loop for Two Dimensional Array will take the array the
        // array
        // That's the reason we had K[] in the for loop

        for (int k[] : p) { // Here K is the array fetches from the P.
            for (int l : k) { // L takes the values from the K
                System.out.print(l + " "); // L is printing here
            }
            System.out.println(" ");
        }
    }
}
