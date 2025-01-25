import java.util.Scanner;

public class pract1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        
        // Store original value of n for display purpose
        int originalN = n;
        
        int res = 0;
        int power = 0;
        
        while (n > 0) {
            int rem = n % 2;
            res = res + rem * (int) Math.pow(10, power);
            n = n / 2;
            power++;
        }
        
        System.out.println("Binary of " + originalN + " is " + res);
        sc.close();  // Correct way to close the scanner
    }
}
