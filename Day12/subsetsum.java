import java.util.ArrayList;

public class subsetsum {
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6};
        int target = 5;
        System.out.println(subsetsum(arr,target,arr.length));
    }

    public static boolean  subsetsum(int arr[],int target,int n)
    {
        if(target == 0) return true;
        if(n==0)
        {
            return false;
        }
        boolean ans =false;
        if(arr[n-1] <= target ){
            boolean pick = subsetsum(arr,(target-arr[n-1]),n-1); // pick
            boolean notpick = subsetsum(arr,target,n-1); // not pick

            ans = pick || notpick;
        }
        else {

            // here one option not to pick
            ans = subsetsum(arr,target,n-1); // not pick
        }
        return ans;
    }

    public static boolean  subsetsum_mem(int arr[],int target,int n,Boolean dp[][])
    {
        if(target == 0) return dp[n][target] = true;
        if(n==0)
        {
            return dp[n][target] = false;
        }
        if(dp[n][target] != null) return dp[n][target];
        boolean ans =false;
        if(arr[n-1] <= target ){
            boolean pick = subsetsum_mem(arr,(target-arr[n-1]),n-1,dp); // pick
            boolean notpick = subsetsum_mem(arr,target,n-1,dp); // not pick

            ans = pick || notpick;
        }
        else {

            // here one option not to pick
            ans = subsetsum_mem(arr,target,n-1,dp); // not pick
        }
        return dp[n][target]=ans;
    }
}
