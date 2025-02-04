// Program for nth Catalan Number
/*
 * Catalan numbers are defined as a mathematical sequence that consists of positive integers, which can be used to find the number of possibilities of various combinations. 
 * https://www.geeksforgeeks.org/program-nth-catalan-number/
The first few Catalan numbers for n = 0, 1, 2, 3, … are : 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, …


Input: n = 6
Output: 132


Input: n = 8
Output: 1430
 */

 public  class pract7 {
    public static int findCatalan(int n) {
        // code here
        int [] ans= new int[n+1];
        ans[0]=1;
        ans[1]=1;
        for(int i=2;i<ans.length;i++)
        {
            for(int j=0;j<i;j++){
                ans[i]+=ans[j]*ans[i-j-1];
            }
        }
        return ans[n];
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Catalan Number C(" + n + ") = " + findCatalan(n)); 
    }
 }
