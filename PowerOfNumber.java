/**
 * Given a number and its reverse. Find that number raised to the power of its own reverse.
 * Note: As answers can be very large, print the result modulo 109 + 7.
 *
 * Example 1:
 *
 * Input:
 * N = 2
 * Output: 4
 * Explanation: The reverse of 2 is 2
 * and after raising power of 2 by 2
 * we get 4 which gives remainder as
 * 4 by dividing 1000000007.
 * Example 2:
 *
 * Input:
 * N = 12
 * Output: 864354781
 * Explanation: The reverse of 12 is 21
 * and 1221 , when divided by 1000000007
 * gives remainder as 864354781.
 */
public class PowerOfNumber
{
    static int mod = 1000000007;
    public static long DAC_Power(int a, int n)
    {
        long b,c;
        int mid;
        if(n==1||n==0)
        {
            return a;
        }
        else
        {
            mid = n/2;
            b = DAC_Power(a,mid);
            c = (b*b)%mod;
            if(n%2==0)
            {
                return c%mod;
            }
            else
            {
                return (c*a)%mod;
            }
        }
    }
    public static void main(String[] args)
    {
        int a = 12, b = 8;
        long x = DAC_Power(a,b);
        System.out.println(x);
    }
}
