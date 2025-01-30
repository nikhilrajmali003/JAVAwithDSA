import java.util.Scanner;

public class Pract6 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Enter any number (decimal): ");
        int n = x.nextInt();

        System.out.println("Enter the base to convert to: ");
        int b = x.nextInt();

        decimaltoanybaseno(n, b);

        System.out.print("Enter any number in any base: ");
        int n2 = x.nextInt();

        System.out.println("Enter the base of the number you want to convert: ");
        int b1 = x.nextInt();  // Fixed: Corrected syntax from x,nextInt() to x.nextInt()

        anybasetodecimal(n2, b1);  // Fixed: Passed the correct variable b1, not b

        x.close();
    }

    static void decimaltoanybaseno(int n, int b) {
        int original = n;
        int r = 0, p = 0;

        while (n > 0) {
            int rem = n % b;
            r = r + rem * (int) Math.pow(10, p);
            p++;
            n /= b;  // Fixed: Reduce n to avoid infinite loop
        }

        System.out.println(original + " in base " + b + " is: " + r);
    }

    static void anybasetodecimal(int n, int b) {
        int original = n;
        int r = 0, p = 0;

        while (n > 0) {
            int rem = n % 10;  // Fixed: Corrected the calculation for extracting digits
            r = r + rem * (int) Math.pow(b, p);  // Fixed: Properly calculate decimal value
            p++;
            n /= 10;
        }

        System.out.println(original + " in base " + b + " is: " + r + " in decimal.");
    }
}
