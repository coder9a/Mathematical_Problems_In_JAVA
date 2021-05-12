/**
 * Given a number N, find an integer denoting the smallest number evenly divisible by each number from 1 to n.
 *
 *
 * Example 1:
 *
 * Input:
 * N = 3
 * Output: 6
 * Explanation: 6 is the smallest number
 * divisible by 1,2,3.
 *
 * Example 2:
 *
 * Input:
 * N = 6
 * Output: 60
 * Explanation: 60 is the smallest number
 * divisible by 1,2,3,4,5,6.
 */
public class SmallestDivisibleNumber
{
    public static long gcd(long a, long b)
    {
        if(a==0)
            return b;
        if(b==0)
            return a;
        else
            return gcd(b, a%b);
    }
    public static void main(String[] args)
    {
        long ans=1;
        long n = 25;
        for(long i=1;i<=n;i++)
        {
            ans = (ans*i)/gcd(ans, i);
        }
        System.out.println(ans);
    }
}
