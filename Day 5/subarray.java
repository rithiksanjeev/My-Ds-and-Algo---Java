public class subarray {
    public static void main(String[] args)
    {
        int arr[]= {10,20,30,40,50,60};
        subarrays(arr);
    
    }
    public static void subarrays(int arr[])
    {
        for(int st=0;st< arr.length-1;st++)
        {
            for (int end=st;end <arr.length-1;end++)
            {
                displaysub(arr,st,end);
            }
            
        }
    }

    public static void displaysub(int arr[],int st,int end){
        for(int i=st;i<=end;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
