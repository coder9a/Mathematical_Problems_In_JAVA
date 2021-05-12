/**
 * You are given an integer N. You need to convert all zeroes of N to 5.
 *
 * Example 1:
 *
 * Input:
 * N = 1004
 * Output: 1554
 * Explanation: There are two zeroes in 1004
 * on replacing all zeroes with "5", the new
 * number will be "1554".
 * Example 2:
 *
 * Input:
 * N = 121
 * Output: 121
 * Explanation: Since there are no zeroes in
 * "121", the number remains as "121".
 */
public class Replace0With5
{
    public static void main(String[] args)
    {
        int n = 1005;
        String str = Integer.toString(n);
        str = str.replace('0','5');
        n = Integer.parseInt(str);
        System.out.println(n);
    }
}
