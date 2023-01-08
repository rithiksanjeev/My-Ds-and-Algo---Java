public class recursion {
    public static void main(String args[])
    {
        System.out.println("How are you?");
        // for(int i=1;i<=5;i++)
        // {
        //     System.out.println("How are you?");
        // }
        greet();
        // call the function 5 times
    }

    public static void greet()
    {
        int i =0;
        if(i<=5)
        {
            System.out.println("hello");
            i=i+1;
            greet();
        }
        
    }

   
}
