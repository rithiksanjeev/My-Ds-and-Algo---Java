package Day11;

import java.util.Arrays;

public class dynamicfib {
    public static void main(String args[])
    {
        int n=8;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        int ans =fibbo_tabbu(n,dp);
        System.out.println(ans);
    //    int ans=  fibbo(8);
    //    System.out.println(ans);
    }

    public static int fib_rec(int n)
    {
        //base cases
        if(n<=1)
        {
            return n;
            
        }
        return fib_rec(n-1) + fib_rec(n-2);
        
    }

    public static int fib_mem(int n,int dp[]) // top bottom
    {
        if(n<=1)
        {
            return dp[n]=n;
        }
         //before calculating first check if it has been calcuated earlier or not -> memoization
         if(dp[n] != -1 )
         {
            return dp[n];
         } 
         // if not calculate fib of n-1 and n-2
        
        int f1= fib_mem(n-1,dp);
        int f2 = fib_mem(n-2,dp);

         //now first store and then return
        dp[n] = (f1+f2);
        return f1+f2;
    }

    public static int fibbo_tabbu(int N,int dp[]) //bottom up
    {
        for(int n=0;n<dp.length;n++)
        {
        if(n==0 || n==1)
        {
            dp[n]=n;
            continue;
        }
        int f1 = dp[n-1];
        int f2 = dp[n-2];
        dp[n] = (f1+f2);
        }
        return dp[N];
    }

    public static int fibbo(int n)
    {
        int first = 0;
        int second = 1;
        int ans = 0;
        for(int i=2;i<=n;i++)
        {
            ans = first +second;
            first = second;
            second = ans;
        }
        return ans;
       
    }

}
