import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0)
        {
            System.out.println(1);
            return ;
        }
        if(n<0)
        {
            System.out.println(0);
            return ;
        }
        int[] dp = new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++)
        {
            if(i==1)
            {
                dp[i]=dp[i-1];
            }
            else if(i==2)
            {
                dp[i]=dp[i-1]+dp[i-2];
            }
            else
            {
                dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
            }
        }
       System.out.println(dp[n]);
    }

}
