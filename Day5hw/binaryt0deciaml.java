package Day5hw;

public class binaryt0deciaml {
    public static void main(String args[])
    {
        int num = 100001;
        powerval(num);
    }
    public static void powerval(int val)
    {
        int rem = 0;
        int sum =0;
        int base=1;
        while(val !=0)
        {
            rem = val%10;
            if(rem ==1){
                sum = sum+base;
            }
            base = base*2;
            val=val/10;
        }
        System.out.println(sum);
    }
}
