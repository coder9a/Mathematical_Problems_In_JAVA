/**
 * Given a number N, find the first N Fibonacci numbers.
 * The first two number of the series are 1 and 1.
 *
 * Example 1:
 *
 * Input:
 * N = 5
 * Output: 1 1 2 3 5
 * Example 2:
 *
 * Input:
 * N = 7
 * Output: 1 1 2 3 5 8 13
 * Your Task:
 * Your task is to complete printFibb() which takes single argument N and returns a list of first N Fibonacci numbers.
 *
 * Expected Time Complexity: O(N).
 * Expected Auxiliary Space: O(N).
 */
public class FirstNFibonacciNumbers
{
    public static long[] DP_Fib(long n)
    {
        long [] arr = new long[(int) n];
        long [] fib = new long[(int) (n+1)];
        long i;
        fib[0] = 0;
        fib[1] = 1;
        arr[0] = 1;
        for(i=2;i<=n;i++)
        {
            fib[(int) i] = fib[(int) (i-1)] + fib[(int) (i-2)];
            arr[(int) (i-1)] = fib[(int) i];
        }
        return arr;
    }
    public static void main(String[] args)
    {
        long n = 7;
        long[] x = DP_Fib(n);
        for (int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
    }
}
