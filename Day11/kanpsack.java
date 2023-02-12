public class kanpsack {
    public static void main(String args[])
    {
        // max cost selecting weight == cap
        int cost[] = {10,13,12,13,18,17,15};
        int wt[] = {2,3,1,3,3,2,1};
        int cap = 10;
        int dp[][] = new int[cost.length-1][cap+1];
        int maxprofit = knapsap(cost,wt,cap,cost.length);
        System.out.println(maxprofit);

    }
    public static int knapsap(int cost[],int wt[],int cap,int n)
    {
        // base case
        if(n<=0 || cap==0)
        {
            return 0;
        }
        // everytime we hav two choises
        int Maxprofit =0;

        //if i pick , but before picking i also have to check whether i can pick or that
        if(wt[n-1] <= cap)
        {
            int c1 = cost[n-1] + knapsap(cost,wt,(cap - wt[n-1]),n-1); //picking the element -> recursion will give the max profit
            int c2 = 0 + knapsap(cost,wt,cap,n-1); // not picking
            Maxprofit = Math.max(c1, c2);
        }
        else{
            // Here in this case , i have just one option not to pick
            Maxprofit = 0 + knapsap(cost,wt,cap,n-1);
        }
        return Maxprofit;
    }

    public static int knapsap_memo(int cost[],int wt[],int cap,int n,int dp[][]) // topdown
    {
        // base case
        if(n<=0 || cap==0)
        {
            return dp[n-1][cap-1] = 0;
        }
        // memoziation
        if(dp[n-1][cap-1] != -1 )
        {
            return dp[n-1][cap-1];
        }
        // everytime we hav two choises
        int Maxprofit =0;

        //if i pick , but before picking i also have to check whether i can pick or that
        if(wt[n-1] <= cap)
        {
            int c1 = cost[n-1] + knapsap_memo(cost,wt,(cap - wt[n-1]),n-1,dp); //picking the element -> recursion will give the max profit
            int c2 = 0 + knapsap_memo(cost,wt,cap,n-1,dp); // not picking
            Maxprofit = Math.max(c1, c2);
        }
        else{
            // Here in this case , i have just one option not to pick
            Maxprofit = 0 + knapsap_memo(cost,wt,cap,n-1,dp);
        }
        return dp[n-1][cap-1] = Maxprofit;
    }
}
