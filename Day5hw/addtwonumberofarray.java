package Day5hw;

public class addtwonumberofarray {
    //https://www.geeksforgeeks.org/add-two-numbers-represented-by-two-arrays/
    public static void main(String args[])
    {
        int arr[]= {9, 5, 4, 9};
        int brr[] = {2,1,4};
        int num =0;
        int num2 =0;
        for(int i=0;i<arr.length;i++)
        {
            num = num*(value(arr[i]))+arr[i];
        }
        for(int i=0;i<brr.length;i++)
        {
            num2 = num2*(value(brr[i]))+brr[i];
        }
        int val=0;
        int sum[]=new int[1];
        val = num+num2;
        sum[0]=val;
        System.out.println(sum[0]);
    }

    public static int value(int num){
        int lastdigit =1;
        while(num!=0)
        {
            lastdigit = lastdigit*10;
            num =num/10;
        }
        return lastdigit;
    }
    
}
