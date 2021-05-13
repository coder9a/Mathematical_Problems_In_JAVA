/**
 * Given the maximum possible area of the right angle triangle for a fixed length of hypotenuse.
 * The task is to find the length of hypotenuse.
 *
 * Note: If the answer comes in Decimal, find it's Floor value.
 *
 * Example 1:
 *
 * Input:
 * N = 25
 * Output:
 * 10
 * Explanation:
 * For a maximum area of 25 square Units
 * of a Right-angled Triangle,
 * the length of it's Hypotenuse is 10.
 * Example 2:
 *
 * Input:
 * N = 21
 * Output:
 * 9
 * Explanation:
 * For a maximum area of 21 square Units
 * of a Right-angled Triangle, the
 * length of it's Hypotenuse is 9.165 = 9.
 */
public class MaximumArea
{
    public static void main(String[] args)
    {
        long n = 25;
        int x = (int) Math.sqrt(n*4);
        System.out.println(x);
    }
}
