import java.util.*;  
public class rectuf {

    public static void main(String args[])
    {
       // printdecback(1,3);
       // sumparam(5);
       //factparam(5,1);
       //System.out.println(fact(5));
    //    ArrayList<Integer> al = new ArrayList<>();// Growing and shrink in real time
    //    al.add(10);
    //    al.add(20);
    //    al.add(30);
    //    al.add(40);
    //    al.add(50);
    //    al.add(60);
    //    al.add(70);
    //    reversearr(al,0,al.size());
    //    for(int i:al) // for every element in the data structure
    //    {
    //        System.out.println(i);
    //    }
       System.out.println(fib(4));
    }
    
    public static void printdecback(int i,int n){
        //base condition
        if(i>n){
            return;
        }
        // faith recursion will go till 1 to n
        printdecback(i+1,n);
        // task print in dec order
        System.out.println(i);
    }

    public static int sumparam(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n + sumparam(n-1);
    }

    public static void factparam(int i,int fact)
    {
        if(i<1)
        {
            System.out.println(fact);
            return;
        }
        factparam(i-1,fact*i);
    }

    public static int fact(int n){
        //base condtion
        if(n==0)
        {
            return 1;
        }
        return n * fact(n-1);
      
    }
    public static void reversearr(List al,int start,int end)
    {
      if(start > end/2)
       return;
       Collections.swap(al, start, end-1);
       reversearr(al,start+1, end-start-1);
    }

    public static int fib(int n)
    {
        if(n<=1)
         return n;
        return fib(n-2)+fib(n-1);

    }
    
}
