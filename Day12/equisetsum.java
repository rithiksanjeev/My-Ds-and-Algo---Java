package Day12;

public class equisetsum {
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6};
        equiset(arr,arr.length);
    }

    public static int equiset(int arr[],int n)
    {
        if(n == 0) {
            return 0;
        }
        int s1 = arr[n-1] + equiset(arr,n-1);
        int s2 = 0 + equiset(arr,n);
        return 1;
        
    }
}
