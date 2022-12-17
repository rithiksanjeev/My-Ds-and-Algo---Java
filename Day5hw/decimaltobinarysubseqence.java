package Day5hw;

public class decimaltobinarysubseqence {
    public static void main(String args[])
    {
        String arr[]= {"a","b","c"};
        subsequence(arr);
       // numtobin(10);
    }

    public static void numtobin(int num,String[] arr)
    {
        int[] rev = new int[arr.length];
        int i=0;
        while(num!=0)
        {
            rev[i] = num%2;
            num=num/2;
            i++;
        }
        for (int j=rev.length-1;j>=0;j--)
        {
            if(rev[j]==1)
            {
                System.out.print(arr[j]);
               // System.out.print(rev[j]);
            }
            
        }
    }
    public static void subsequence(String[] arr)
    {
        int val = arr.length;
        double total_Sequence = Math.pow(2, val);
        int value = (int)total_Sequence - 1;
        while(value>=0)
        {
            numtobin(value,arr);
            value=value-1;
            System.out.println();
        }
    }

}
