package Recursion;

public class reversenum {

    public static void main(String[] args) {
        int n=1234;
        int digits = (int)(Math.log10(n)) +1;
        int ans = rev(n,digits);
        System.out.println(ans);
    }

    static int rev(int n,int num)
    {
        
        if(n==0)
        {
            return 0;
        }
        return (n%10)* (int)Math.pow(10, num-1) + rev(n/10,num-1);
    }
    
}
