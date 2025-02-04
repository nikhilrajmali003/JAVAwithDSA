// Binomial Coefficient | DP-9

// Given an integer values n and k, the task is to find the value of Binomial Coefficient C(n, k).

// A binomial coefficient C(n, k) can be defined as the coefficient of x^k in the expansion of (1 + x)^n.
// A binomial coefficient C(n, k) also gives the number of ways, disregarding order, that k objects can be chosen from among n objects more formally, the number of k-element subsets (or k-combinations) of a n-element set.
// Examples:

// Input : n = 4, k = 2
// Output : 6


// Input : n = 5, k = 2
// Output: 10


public class pract5 {
    public static int binomialCoefficient(int n, int k) {
        int[] dp = new int[k + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = Math.min(i, k); j > 0; j--) {
                dp[j] += dp[j - 1];
            }
        }
        return dp[k];
    }

    public static void main(String[] args) {
        System.out.println(binomialCoefficient(5, 2));  // Output: 10
    }
}
