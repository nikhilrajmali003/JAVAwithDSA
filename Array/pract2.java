// Maximum product of a triplet (subsequence of size 3) in array
/*
 * Given an integer array, find a maximum product of a triplet in the array.

Examples: 

Input:  [10, 3, 5, 6, 20]
Output: 1200
Explanation: Multiplication of 10, 6 and 20



Input:  [-10, -3, -5, -6, -20]
Output: -90



Input:  [1, -4, 3, -6, 7, 0]
Output: 168
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class pract2 {
    public static void main(String[] args) {
  ArrayList<Integer> a = new ArrayList<>(Arrays.asList(-30,-50,1 ,2,3));
  Collections.sort(a);
  int x = a.get(a.size() - 1);
        int y = a.get(a.size() - 2);
        int z = a.get(a.size() - 3);
        System.out.println((x*y*z)+"");
    }
}