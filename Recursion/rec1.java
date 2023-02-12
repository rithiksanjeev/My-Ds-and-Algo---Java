package Recursion;

public class rec1 {
    public static void main(String args[])
    {
        print(5);
        //print2(1);
    }
    public static void print(int n)
    {
        // base condition
        if(n==0) return; // return alwayas returns to function who call him the line of execution goes there
        // faith recursion will make the n values as 0
        print(n-1);
        // task print the n values when popping out from stack
        System.out.println(n);
    }

    public static void print2(int n)
    {
        // base condition
        if(n == 5) 
        {
            System.out.println(n);
            return;
        }
        // task
        System.out.println(n);
        // faith recursion will generate by next n value
        print2(n+1); // tail recursion (last function call)
    }
}
