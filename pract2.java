// Program to Find GCD or HCF of Two Numbers
// Given two numbers a and b, the task is to find the GCD of the two numbers.

// Note: The GCD (Greatest Common Divisor) or HCF (Highest Common Factor) of two numbers is the largest number that divides both of them. 

// Examples:

// Input: a = 20, b = 28
// Output: 4
// Explanation: The factors of 20 are 1, 2, 4, 5, 10 and 20. The factors of 28 are 1, 2, 4, 7, 14 and 28. Among these factors, 1, 2 and 4 are the common factors of both 20 and 28. The greatest among the common factors is 4.


public class pract2 {
    public static void main(String[] args) {
        int n=60,n1=36;
        int p=1;
        // Approche =1
        // int m=Math.min(n,n1);
        // for(int i=2;i<=m;i++)
        // {

        //     if(n%i==0 && n1%i==0)
        //     {
        //         p=i;
        //     }
        // }
        // System.err.println(p);

        // Approch =2
        System.out.println(gcd(n,n1));
        
    }
   static int gcd(int a, int b){
  
        // Everything divides 0
        if(b == 0){
          return a;
        }
        
        return gcd(b, a % b);
      }
    
}
