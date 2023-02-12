package Recursion;

public class fib {
    public static void main(String args[])
    {
         int ans = fib(4);
        System.out.println(ans);
    }
    public static int fib(int n)
    {
        if(n<2)
        {
            return n;
        }
        int val1= fib(n-1);
        int val2 = fib(n-2);
        return val1+val2;
    }
}
