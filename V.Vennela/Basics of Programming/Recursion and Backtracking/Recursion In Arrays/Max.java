import java.io.*;
import java.util.*;

public class Max {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(maxOfArray(a,n-1));
    }

    public static int maxOfArray(int[] arr, int idx)
    {
        
        if(idx==0)
            return arr[0];
        int max = maxOfArray(arr, idx-1);
        if(arr[idx]>max)
            return arr[idx];
        return max;
    }

}
