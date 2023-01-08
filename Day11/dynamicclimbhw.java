package Day11;
import java.util.Arrays;
public class dynamicclimbhw {
    public static void main(String args[])
    {
        int n=8;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        int ans =climbsw(n,dp);
        System.out.println(ans);
    }
    public static int climbsw(int n,int dp[])
    {
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }
        if(dp[n] != -1) //memoization
        {
            return dp[n];
        }
        int p1= climbsw(n-2,dp);
        int p2 = climbsw(n-1,dp);
        dp[n] = p1+p2;
        return p1+p2;
           
    }
}
