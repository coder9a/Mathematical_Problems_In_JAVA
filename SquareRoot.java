/**
 * Given an integer x, find the square root of x.
 * If x is not a perfect square, then return floor(√x).
 *
 *
 * Example 1:
 *
 * Input:
 * x = 5
 * Output: 2
 * Explanation: Since, 5 is not a perfect
 * square, floor of square_root of 5 is 2.
 * Example 2:
 *
 * Input:
 * x = 4
 * Output: 2
 * Explanation: Since, 4 is a perfect
 * square, so its square root is 2.
 */
public class SquareRoot
{
    public static long FindSqrt(long n)
    {
        long l = 0, r = n, mid, ans = 0;
        if(n==1 || n==0)
        {
            return n;
        }
        while(l<=r)
        {
            mid = (l+r)/2;
            if(mid*mid == n)
                return mid;
            else if(mid*mid > n)
            {
                r = mid-1;
            }
            else 
            {
                l = mid+1;
                ans = mid;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
//        Inbuilt Function
//        -------------------------------------------------------
//        long n = 64;
//        long x = (long) Math.sqrt(n);
//        System.out.println(x);
//        -------------------------------------------------------
//        User Defined Function
//        Time Complexity = O(logn)
        long n = 102411;
        long x = FindSqrt(n);
        System.out.println(x);
    }
}
