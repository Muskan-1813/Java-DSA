import java.util.*;

public class Functions {

    // Prints a simple greeting message
    public static void printHello() {
        System.out.println("Hello Guyz!!");
    }

    // Returns the sum of two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Swaps the values of a and b (inside this method only, no effect outside)
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        // Showing swapped values
        System.out.println("Value of a is: " + a);
        System.out.println("Value of b is: " + b);
    }

    // Returns the product of two integers
    public static int product(int a, int b) {
        return a * b;
    }

    // Returns factorial of a given integer 'a'
    public static int factorial(int a) {
        int fact = 1;

        // Multiply numbers from a → 1
        for (int i = a; i >= 1; i--) {
            fact *= i;
        }
        return fact;
    }

    // ---------------------------------------
    // FUNCTION OVERLOADING EXAMPLES
    // ---------------------------------------

    // Overloading based on number of parameters
    public static int Sum(int A, int B) {
        return A + B;
    }

    // Another Sum method with 3 parameters
    public static int Sum(int A, int B, int C) {
        return A + B + C;
    }

    // Overloading based on data type
    public static int Sum1(int A, int B) {
        return A + B;
    }

    // Float version of Sum1()
    public static float Sum1(float A, float B) {
        return A + B;
    }

    // --------------------------------------------------------------------
    // BINARY → DECIMAL CONVERSION
    // Example: 101 → 5
    // Logic: Multiply each binary digit with 2^position and add to result
    // --------------------------------------------------------------------
    public static void binToDec(int bnum) {
        int dec = 0;  // final decimal result
        int pow = 0;  // position index (0,1,2,...)

        while (bnum != 0) {
            int lastDigit = bnum % 10;           // extract last digit of binary number
            dec = dec + lastDigit * (1 << pow);  // 1<<pow is same as 2^pow (faster)
            pow++;                                // move to next power of 2
            bnum /= 10;                           // remove last digit
        }

        System.out.println("Decimal number is: " + dec);
    }

    // --------------------------------------------------------------------
    // DECIMAL → BINARY CONVERSION
    // Example: 5 → 101
    // Logic: Divide by 2, collect remainders and build binary number
    // --------------------------------------------------------------------
    public static void decToBin(int Dnum) {
        int original = Dnum;  // saving original number for printing
        int Bnum = 0;         // final binary number
        int pow = 0;          // position index for binary digits

        while (Dnum != 0) {

            int rem = Dnum % 2;                   // remainder gives binary digit
            Bnum = Bnum + rem * (int) Math.pow(10, pow);  
            pow++;                                // move to next binary position (1,10,100,...)
            Dnum /= 2;                            // reduce the number
        }

        System.out.println("Binary of " + original + " is " + Bnum);
    }

    // --------------------------------------------------------------------
    // MAIN METHOD
    // --------------------------------------------------------------------
    public static void main(String[] args) {

        printHello(); // greeting message
        
        Scanner sc = new Scanner(System.in);

        // Taking two numbers from user
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Calling different functions
        System.out.println("Sum is: " + sum(a, b));
        System.out.println("Product is: " + product(a, b));
        System.out.println("Factorial is: " + factorial(a));

        // Swap demonstration
        swap(a, b);

        // Function overloading examples
        System.out.println(Sum(2, 5));
        System.out.println(Sum(2, 5, 8));
        System.out.println(Sum1(2, 5));
        System.out.println(Sum1(2.6f, .95f));

        // Binary-Decimal conversions
        binToDec(101);
        decToBin(5);
    }
}
