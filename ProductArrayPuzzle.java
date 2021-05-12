/**
 * Given an array nums[] of size n, construct a Product Array P (of same size n) such that
 * P[i] is equal to the product of all the elements of nums except nums[i].
 *
 *
 *
 * Example 1:
 *
 * Input:
 * n = 5
 * nums[] = {10, 3, 5, 6, 2}
 * Output:
 * 180 600 360 300 900
 * Explanation:
 * For i=0, P[i] = 3*5*6*2 = 180.
 * For i=1, P[i] = 10*5*6*2 = 600.
 * For i=2, P[i] = 10*3*6*2 = 360.
 * For i=3, P[i] = 10*3*5*2 = 300.
 * For i=4, P[i] = 10*3*5*6 = 900.
 * Example 2:
 *
 * Input:
 * n = 2
 * nums[] = {12,0}
 * Output:
 * 0 12
 */
public class ProductArrayPuzzle
{
//    --------------------------------------------------------------------
//    Using Division Operator
//    --------------------------------------------------------------------
//    public static void main(String[] args)
//    {
//        int [] arr = {12,0,11,0};
//        int n = arr.length;
//        long [] newArr = new long[n];
//        long p=1,flag=0,x=0;
//        for(int i=0;i<n;i++)
//        {
//            if(arr[i] == 0)
//            {
//                flag++;
//            }
//            else
//            {
//                p = p*arr[i];
//            }
//        }
//        for (int i=0;i<n;i++)
//        {
//            if(flag>1)
//            {
//                newArr[i] = 0;
//            }
//            else if(flag==0)
//            {
//                newArr[i] = p/arr[i];
//            }
//            else if(flag==1 && arr[i]!=0)
//            {
//                newArr[i] = 0;
//            }
////            else if(flag==1 && arr[i] == 0)
//            else
//            {
//                newArr[i] = p;
//            }
//        }
//        for (int i=0;i<n;i++)
//        {
//            System.out.print(newArr[i]+" ");
//        }
//    --------------------------------------------------------------------
//    Without Using Division Operator
//    Time Complexity = O(n)
//    Space Complexity = O(n)
//    --------------------------------------------------------------------
//    public static void main(String[] args)
//    {
//        long [] arr = {1,2,3,4};
//        int n = arr.length;
//        long p = 1;
//        long [] left = new long[n];
//        long [] right = new long[n];
//        long [] newArr = new long[n];
//        if(n==1)
//        {
//            newArr[0] = 1;
//        }
//        else
//        {
//            for(int i=0;i<n;i++)
//            {
//                p = arr[i]*p;
//                left[i] = p;
//            }
//            for (int i=0;i<n;i++)
//            {
//                System.out.print(arr[i]+" ");
//            }
//            System.out.println();
//            for (int i=0;i<n;i++)
//            {
//                System.out.print(left[i]+" ");
//            }
//            System.out.println();
//            p = 1;
//            for (int i=n-1;i>=0;i--)
//            {
//                p = arr[i]*p;
//                right[i] = p;
//            }
//            for (int i=0;i<n;i++)
//            {
//                System.out.print(right[i]+" ");
//            }
//            System.out.println();
//            for (int i=1;i<n-1;i++)
//            {
//                newArr[i] = left[i-1]*right[i+1];
//            }
//            newArr[0] = right[1];
//            newArr[n-1] = left[n-2];
//        }
//        for (int i=0;i<n;i++)
//        {
//            System.out.print(newArr[i]+" ");
//        }
//    }
//    --------------------------------------------------------------------
//    Without Using Division Operator
//    Time Complexity = O(n)
//    Space Complexity = O(1)
//    --------------------------------------------------------------------
    public static void main(String[] args)
    {
        long[] arr = {1, 2, 3, 4};
        int n = arr.length;
        long p = 1;
        long[] left = new long[n];
        long[] newArr = new long[n];
        if (n == 1)
        {
            newArr[0] = 1;
        }
        else
        {
            for (int i = 0; i < n; i++)
            {
                p = arr[i] * p;
                left[i] = p;
            }
            p = arr[n - 1];
            for (int i = n - 2; i > 0; i--)
            {
                newArr[i] = left[i - 1] * p;
                p = p * arr[i];
            }
            newArr[0] = p;
            newArr[n - 1] = left[n - 2];
        }
        for (int i=0;i<n;i++)
        {
            System.out.print(newArr[i]+" ");
        }
    }
}
