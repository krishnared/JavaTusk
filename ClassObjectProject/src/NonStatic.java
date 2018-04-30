
public class NonStatic {
    // We Cannot use Non-static variables in static methods
    static int a;
    int b;

    public static void main(String[] args) {
        a = 5;
        // b=5; ->NonStatic varibale cannot be assigned in static variable
    }
}
/*
 * Two types of variables 
 * 1)Static variable -> Need Class to call the variables& Methods
 * 2)NonStatic variable -> Need Object to call the variables and Methods
 */
