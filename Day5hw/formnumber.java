package Day5hw;

public class formnumber {
    public static void main(String args[])
    {
        int arr[]= {12311, 45, 6, 78} ;
        int num=0;
        for(int i=0;i<arr.length;i++)
        {
            num = num*(value(arr[i]))+arr[i];
        }
        System.out.println(num);
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
