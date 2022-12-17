package Day2;

public class functions {
    public static void main(String args[])
    {
        greet();
        int x = SI(0,0,0);
        System.out.println(x);
        displayreverse(12345);
        int total_sum = sum(12345);
        System.out.println(total_sum);
    }
    public static int SI(int p,int r,int t){
        int ans = ((p*r*t)/100);
        return ans;
    }
    public static void greet(){
        System.out.println("hello RIthik,GM!");
    }
    public static int displayreverse(int n){
        //12345 54321
        int rev=0;
        int rem=0;
        while(n>0)
        {
            rem = n %10;
            rev = (rev*10) + rem;
            n = n/10;
        }
        System.out.println(rev);
        return rev;
    }
    public static int sum(int n)
    {
        int sum=0;
        int rem=0;
        while(n>0)
        {
            rem = n %10;
            sum = sum + rem;
            n = n/10;
        }
        return sum;
    }
}
