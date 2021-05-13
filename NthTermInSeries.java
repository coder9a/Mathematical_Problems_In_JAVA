/**
 * Given a series 9, 33, 73, 129...
 * Find the n-th term of the series.
 *
 * Example 1:
 *
 * Input: n = 4
 * Output: 129
 * Explanation: 4th term of the
 * series is 129.
 *
 * Example 2:
 *
 * Input: n = 5
 * Output: 201
 * Explanation: 5th term of the
 * series is 201.
 */

import java.util.Locale;

public class NthTermInSeries
{
//    -----------------------------------------------------
//    Time Complexity = O(n)
//    Space Complexity = O(1)
//    public static void main(String[] args)
//    {
//        long n = 4;
//        long s = 1, j = 1;
//        for(int i=1;i<=n;i++)
//        {
//            s = s + 8*j;
//            j+=2;
//        }
//        System.out.println(s);
//    }
//    -----------------------------------------------------
//    Time Complexity = O(1)
//    Space Complexity = O(1)
    public static void main(String[] args)
    {
        int n = 4;
        int t = 8*n*n + 1;
        System.out.println(t);
    }
}
