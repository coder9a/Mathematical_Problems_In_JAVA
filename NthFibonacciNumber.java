/**
 * Given a positive integer n, find the nth fibonacci number.
 * Since the answer can be very large, return the answer modulo 1000000007.
 *
 * Example 1:
 *
 * Input: n = 2
 * Output: 1
 * Explanation: 1 is the 2nd number
 * of fibonacci series.
 * Example 2:
 *
 * Input: n = 5
 * Output: 5
 * Explanation: 5 is the 5th number
 * of fibonacci series.
 */
public class NthFibonacciNumber
{
    static int mod = 1000000007;
    public static long DP_Fib(long n)
    {
        long [] fib = new long[(int) (n+1)];
        long i;
        fib[0] = 0;
        fib[1] = 1;
        for(i=2;i<=n;i++)
        {
            fib[(int) i] = fib[(int) (i-1)]%mod + fib[(int) (i-2)]%mod;
        }
        return fib[(int) n]%mod;
    }
    public static void main(String[] args)
    {
        long n = 656;
        long x = DP_Fib(n);
        System.out.println(x);
    }
}
