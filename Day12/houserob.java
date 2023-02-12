public class houserob {
    public static void main(String args[])
    {
        int arr[] = {1,2,3};
        int ans = rob(arr,arr.length);
        System.out.println(ans);
    }

    public static int rob(int arr[],int n)
    {
        if(n<=0 )
        {
            return 0;
        }
        int max = 0;
        if( n != 0 && n != arr.length)
        {
            int c1 = arr[n-1] + rob(arr, n-2);//pick
            int c2 = rob(arr, n-1);//not pick
            max = Math.max(c1, c2);
        }
        else{
            max = 0 + rob(arr, n-1);
        }
           return max;
    }
        
    }
