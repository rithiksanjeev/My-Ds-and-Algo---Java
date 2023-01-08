public class recursion2 {

    public static void main(String args[])
    {
       
        int n=5;
        greet(n);
    }

    public static void greet(int n)
    {
        if(n>0)
        {
         System.out.println("hai");
          greet(n-1);
        }
    }
    
}
