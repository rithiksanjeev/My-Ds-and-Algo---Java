public class display {
    public static void main(String args[])
    {
        int arr[] = {10,20,30,40,50};
        display(arr);
    }

    public static void display(int arr[])
    {
        for (int idx =0 ;idx<arr.length;idx++)
        {
            System.out.println(arr[idx]+" ");
        }
        System.out.println();
    }
}
