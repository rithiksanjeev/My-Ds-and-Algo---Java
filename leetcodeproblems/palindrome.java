public class palindrome {
    public static void main(String[] args)
    {   
        int x = -121;
        int copy = x;
        int rev = 0;
        int remainder = 0;
        while(x!=0 && x>0)
        {
            remainder  = x%10;
            rev = (rev*10) + remainder;
            x = x / 10;
        }
        boolean a = (rev==copy)?true:false;
        System.out.println(a);
    }
}
