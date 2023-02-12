package Recursion;
// stack inderstanding add debbugger in print1 and understand fully
public class functioncall {
    public static void main(String[] args)
    {
        print1(1);
        System.out.println("function call of print 1 is over so the flow of program is restored to where it is called from");
        
    }
 
    public static void print1(int n)
    {
        System.out.println(n);
        print2(2);
        System.out.println("function call of print 2 is over so the flow of program is restored to where it is called from");
        System.out.println(n); // 1
    }
    public static void print2(int n)
    {
        System.out.println(n);
        print3(3);
        System.out.println("function call of print 3 is over so the flow of program is restored to where it is called from");
        System.out.println(n); // 2
    }
    //function body changes here
    public static void print3(int n)
    {
        System.out.println(n);
    }
}
