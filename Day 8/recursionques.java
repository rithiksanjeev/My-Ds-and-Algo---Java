public class recursionques {
    public static void main(String args[])
    {
    // printdec(5);
    // printinc(5);
      int ans =  sum(5);
      System.out.println(ans);
    //   int ans = fact(5);
    //   System.out.println(ans);
    }

    // public static void printdec(int n){
    // //   if (n>0)
    // //   {
    // //     System.out.println(n);
    // //     printdec(n-1);
    // //   }
    // }

    // expectation from this fun is to print n->1 in decreasing order
    public static void printdec(int n)
    {
     //base case
     if (n==0) return;

    // task print n
    System.out.println(n);

    //have faith that recursion will print (n-1) -> 1 in decreasing order
    printdec(n-1);
    }

    // expectation from this fun is to print 1->n in increasing order
    public static void printinc(int n)
    {
    //base case
    if (n==0) return;

     //have faith that recursion will print 1->n
     printinc(n-1);

    // task print inc
    System.out.println(n);

    }

    // return the sum of all natural numbers upto n
    // every retrun statement return value only to faith
    public static int sum(int n)
    {
        //base case
        if (n==1) return 1;  // this returns value to  faith
        //faith that recursion will return sum of number fron n to n-1
        int faith = sum(n-1);
        System.out.println("sum for n="+(n-1) +"faith is " +faith);
        int task = faith + n;
        System.out.println("faith="+faith +"n=" +n);
        return task; // this returns value to  faith
        // last retun values to main
        
    }

    public static int fact(int n)
    {
      //base case
      if (n==1) return 1;

      //have faith recursion will return the number multiply of number
      int faith =  fact(n-1);
      System.out.println("sum for n="+(n-1) +" is " +faith);

      //task find factorial
      int task = faith * n;

      return task;
    }
}
