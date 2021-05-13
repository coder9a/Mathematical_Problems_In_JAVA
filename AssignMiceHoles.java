/**
 * Given, N Mice and N holes are placed in a straight line.
 * Each hole can accommodate only 1 mouse.
 * A mouse can stay at his position, move one step right from x to x + 1,
 * or move one step left from x to x -1. Any of these moves consumes 1 minute.
 * Write a program to assign mice to holes so that the time when the last mouse gets inside a hole is minimized.
 * Note: Arrays M and H are the positions of the N mice and holes.
 *
 *
 *
 * Example 1:
 *
 * Input:
 * N = 3
 * M = {4, -4, 2}
 * H = {4, 0, 5}
 * Output:
 * 4
 * Explanation:
 * If we assign mouse at 1st index to the hole at 1st, mouse at 2nd index
 * to the hole at 2nd and the third to the hole at third. Then, the maximum
 * time taken will be by the 2nd mouse, i.e. 4-0 = 4 minutes.
 * Example 2:
 *
 * Input:
 * N = 2
 * M = {4, 2}
 * H = {1, 7}
 * Output:
 * 3
 * Explanation:
 * If we assign mouse at 1st index to the hole at 2nd, and mouse at 2nd index
 * to the hole at 1st, the maximum time taken will be by the 2nd mouse,
 * i.e. 7-4 = 3 minutes.
 */

import java.util.Arrays;

public class AssignMiceHoles
{
    public static void main(String[] args)
    {
        int [] m = {4,-4,2};
        int [] h = {4,0,5};
        int n = m.length;
        int max=0;
        if(m.length!=h.length)
        {
            System.out.println("Number of mouse and holes are not equal");
        }
        else
        {
            Arrays.sort(m);
            Arrays.sort(h);
            for(int i=0;i<n;i++)
            {
                if(max < Math.abs(m[i]-h[i]))
                    max = Math.abs(m[i]-h[i]);
            }
            System.out.println(max);
        }
    }
}
