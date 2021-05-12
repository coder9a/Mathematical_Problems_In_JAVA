/**
 * Given a number N, check if N is power of 4 or not.
 *
 * Example 1:
 *
 * Input:
 * N = 64
 * Output: 1
 * Explanation:
 * 44= 64
 * Example 2:
 *
 * Input:
 * N = 75
 * Output : 0
 * Explanation :
 * 75 is not a power of 4.
 */
public class PowerOfFour
{
    public static void main(String[] args)
    {
        long n = 1;
        int flag=0;
        while(n>0)
        {
            if(n==1)
            {
                System.out.println("Number in power of 4");
                break;
            }
            if(n%4!=0)
            {
                flag = 1;
                break;
            }
            n = n/4;
        }
        if(flag==0)
        {
            System.out.println("Number in power of 4");
        }
        else
        {
            System.out.println("Number not in power of 4");
        }
    }
}
