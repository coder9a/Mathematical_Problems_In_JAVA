/**
 * Given two arrays a[] and b[] respectively of size n and m,
 * the task is to print the count of elements in the intersection (or common elements) of the two arrays.
 *
 * For this question, the intersection of two arrays can be defined as
 * the set containing distinct common elements between the two arrays.
 *
 * Example 1:
 *
 * Input:
 * 5 3
 * 89 24 75 11 23
 * 89 2 4
 *
 * Output:
 * 1
 *
 * Explanation:
 * 89 is the only element
 * in the intersection of two arrays.
 * Example 2:
 *
 * Input:
 * 6 5
 * 1 2 3 4 5 6
 * 3 4 5 6 7
 *
 * Output:
 * 4
 *
 * Explanation:
 * 3 4 5 and 6 are the elements
 * in the intersection of two arrays.
 */

import java.util.HashSet;

public class IntersectionTwoArrays
{
    public static void main(String[] args)
    {
        int [] a = {4,4};
        int [] b = {1,2,32,3,4,45,5,3,4};
        int n1 = a.length;
        int n2 = b.length;
        int c=0;
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i=0;i<n1;i++)
        {
            if(!set1.contains(a[i]))
            {
                set1.add(a[i]);
            }
        }
        for (int i=0;i<n2;i++)
        {
            if(!set2.contains(b[i]))
            {
                set2.add(b[i]);
            }
        }
        Object [] arr = set2.toArray();
        for (int i=0;i<arr.length;i++)
        {
            if(set1.contains(arr[i]))
            {
                c++;
            }
        }
        System.out.println(c);
    }
}
