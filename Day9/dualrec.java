package Day9;

public class dualrec {
    public static void main(String args[])
    {
        //Dual Recursive calls.
        //fun(3);
        System.out.println(fib(9));
    }

    public static void fun(int n){
        // base case
        if(n>0)
        {
            System.out.println("Hitting the base case");
            return; // last function call will wipe of from stack and flow will go to last line exectuted in the stack
        }

        System.out.println("pre ->"+n);
        fun(n-1);
        System.out.println("In ->"+n);
        fun(n-1);
        System.out.println("Post -> "+n);
    }

    public static int fib(int n)
    {
        //base cases
        if(n<=1)
        {
            return n;
            
        }
        return fib(n-1) + fib(n-2);
        
    }
}

/* 
pre 3
pre 2
pre 1
Hitting the base case
In 2
In 1
Hitting the base case
Post 2
Post 1
Hitting the base case
*/

/*
pre 3
pre 2
pre 1
Hitting the base case
In 1
Hitting the base case
Post 1
In 2

Pre 1
Hitting the base case
In 1
Hitting the base case
Post 1

Post 2
In 3
Pre 2
Pre 1
Hitting the base case
In 1
Hitting the base case
Post 1
In 2
Pre 1
Hitting the base case
In 1
Hitting the base case
Post 1
Post 2
Post 3
*/


/*
    
*/

