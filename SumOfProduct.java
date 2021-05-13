/**
 * Sum of product of x and y with floor(n/x) = y
 * Basic Accuracy: 86.88% Submissions: 2626 Points: 1
 * Given a positive integer n. Find the sum of product of x and y such that floor(n/x) = y .
 *
 *
 * Example 1:
 *
 * Input: n = 5
 * Output: 21
 * Explanation: Following are the possible
 * pairs of (x, y):
 * (1, 5), (2, 2), (3, 1), (4, 1), (5, 1).
 * So, 1*5 + 2*2 + 3*1 + 4*1 + 5*1
 *    = 5 + 4 + 3 + 4 + 5
 *    = 21.
 * Example 2:
 *
 * Input: n = 10
 * Output: 87
 * Explanation: Sum of product of all
 * possible pairs of (x, y) is 87.
 */
public class SumOfProduct
{
    public static void main(String[] args)
    {
        long x, s = 0, n = 5;
        for(int i=1;i<=n;i++)
        {
            x = n/i;
            s = s+ (x*i);
        }
        System.out.println(s);
    }
}
