
import java.util.Arrays;

// https://www.geeksforgeeks.org/problems/count-digits5716/0
/*
 * Given a positive integer n, count the number of digits in n that divide n evenly (i.e., without leaving a remainder). Return the total number of such digits.

A digit d of n divides n evenly if the remainder when n is divided by d is 0 (n % d == 0).
Digits of n should be checked individually. If a digit is 0, it should be ignored because division by 0 is undefined.

Examples :

Input: n = 12
Output: 2
Explanation: 1, 2 when both divide 12 leaves remainder 0.
Input: n = 2446
Output: 1
Explanation: Here among 2, 4, 6 only 2 divides 2446 evenly while 4 and 6 do not.
Input: n = 23
Output: 0
Explanation: 2 and 3, none of them divide 23 evenly.
 */
public class pract8 {
    public static void main(String[] args) {
        // calculatenoofdidits(23);
        // armstrongno(407);
        // System.out.println(palindromno(121));  // Output: true
        // printallDivisor(34);
        primeno(25);
        seiveAlgo(40);

    }
    static void calculatenoofdidits(int n){
        int count = 0;
        int temp = n;
        
        while (temp > 0) {
            int digit = temp % 10; // Get the last digit
            if (digit != 0 && n % digit == 0) {
                count++; // Increase count if digit divides n evenly
            }
            temp /= 10; // Remove the last digit
        }
        
       System.out.println(count);
    }
    static void armstrongno(int n){
        int t=n;
           int p=0;
           while(t>0){
            int r=t%10;
            p+=r*r*r;
            t/=10;
           }
           if(p==n) System.out.println("Yes");
           else
           System.out.println("NO");
    }
    
    static boolean palindromno(int n){
        int original = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;  // Extract the last digit
            reversed = reversed * 10 + digit; // Build the reversed number
            n /= 10;  // Remove the last digit
        }

        return original == reversed; // Check if original and reversed are equal
    }
    static void printallDivisor(int n){
        System.out.print("Divisors of " + n + " are: ");
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");  // Print the divisor
                
                // If the divisor is not the square root, print its pair
                if (i != n / i) {
                    System.out.print((n / i) + " ");
                }
            }
        }
        System.out.println();
    }
    static void primeno(int n){
        if (n < 2) { // 0 and 1 are not prime numbers
            System.out.println("NO");
            return;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("Yes");
    }

    static void seiveAlgo(int n){
        boolean arr[]=new boolean[n+1];
        Arrays.fill(arr,true);
        int c=2;
        while(c<=n){    
            if(arr[c]==true){
                for(int i=c+c;i<=n;i+=c){
                    arr[i]=false;
                }   
            }
            c++;
        }
        for(int i=2;i<=n;i++){
            System.out.println(i+" :- "+arr[i]);
        }
          
    }
    static void LCM(int n){
        
    }
}   
