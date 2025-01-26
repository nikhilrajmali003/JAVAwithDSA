// Print all prime factors of a given number
// Given a number n, the task is to find all prime factors of n.

// Examples:

// Input: n = 24
// Output: 2 2 2 3
// Explanation: The prime factorization of 24 is 23×3.


// Input: n = 13195
// Output: 5 7 13 29
// Explanation: The prime factorization of 13195 is 5×7×13×29.


public class pract4 {
    public static void main(String[] args) {
        int number = 36;  // Example input number
        System.out.println("Prime factors of " + number + " are:");
        printPrimeFactors(number);
    }

    // Function to print the prime factors of a number
    static void printPrimeFactors(int n) {
        // Print all the 2's that divide n
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n = n / 2;
        }

        // n must be odd at this point, so a skip of 2 is used
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            // While i divides n, print i and divide n
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }

        // This condition is to handle the case when n is a prime number greater than 2
        if (n > 2) {
            System.out.print(n);
        }
    }
}
