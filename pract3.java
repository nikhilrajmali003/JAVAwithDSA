// // Program to find LCM of two numbers
// LCM of two numbers is the smallest number which can be divided by both numbers. 

// Input :  a = 12, b = 18
// Output :  36
// 36 is the smallest number divisible by both 12 and 18


// Input :  a = 5, b = 11
// Output :  55
// 55 is the smallest number divisible by both 5 and 11

public class pract3 {
    public static void main(String[] args) {
        int a=12,b=18;
       // Finding the GCD of a and b
       int gcdValue = gcd(a, b);
        
       // Calculating the LCM using the formula
       int lcmValue = (a * b) / gcdValue;
       
       // Output the LCM
       System.out.println("LCM of " + a + " and " + b + " is: " + lcmValue);
    }
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b; 
        return gcd(b % a, a); 
    }
}
