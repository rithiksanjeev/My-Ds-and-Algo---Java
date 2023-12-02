public class climbstaris {
    public static void main(String[] args)
    {
        // int ans = totalpath(5);
        // System.out.println(ans);
        // printpath(10,"");
        //int ans = totalpathnjumps(5);
       // System.out.println(ans);
       // int ans = countmazepath(2,2);
      //  System.out.println(ans);
       // printmazepath(2,2,"");
       int ans =nclimb(3,"");
       System.out.println(ans);
    }
    // expectation -> total no of paths from n->0
    public static int totalpath(int n)
    {
        //base case
        if (n==0)
        {
            return 1;
        }
        else if(n<0)
        {
            return 0;
        }
         

        // faith of recursion
        int p1 = totalpath(n-1); //asking recursion to tell total no of path in single jump
        int p2 = totalpath(n-2); //asking recursion to tell total no of path in double jump
        // task
        return p1+p2;
    }
    public static void printpath(int n,String path)
    {
        //base case
        if (n==0)
        {
            System.err.println(path);
            return ;
        }
        else if(n<0)
        {
            return ;
        }
         

        // faith of recursion
        printpath(n-1,"j1"); //asking recursion to tell total no of path in single jump
        printpath(n-2,"j2"); //asking recursion to tell total no of path in double jump
        // task
    }

    //expectaion -> jump n steps from nth point
    public static int totalpathnjumps(int n)
    {
        //base case
        if(n==0)
        {
            return n;
        }
        else if(n<0)
        {
            return 0;
        }
        
        //faith recursion will return n value
        int path1 = totalpathnjumps(n-1);
        //task
        return n+path1;


    }

    public static int countmazepath(int r,int c)
    {
        //base case
        if(r==0 && c==0){
            return 1;
        }
        else if(r<0 || c<0)
        {
            return 0;
        }
        int v = countmazepath(r-1, c);
        int h = countmazepath(r, c-1);
        int d = countmazepath(r-1, c-1);
        int ans = countmazepath(r-1, c);
        return ans;
    }
    public static void printmazepath(int r,int c,String path)
    {
        //base case
        if(r==0 && c==0){
            System.out.println(path);
            return ;
        }
        else if(r<0 || c<0)
        {
            return ;
        }
        printmazepath(r-1, c,path+"v");
        printmazepath(r, c-1,path+"h");
        printmazepath(r-1, c-1,path+"d");
    }

    public static int nclimb(int n,String jumps)
    {
        //base case
        if(n==0)
        {
            System.out.println(jumps);
            return 1;
        }
        else if(n < 0)
        {
            return 0;
        }
        int path =0;
        for(int i=1;i<=n;i++)
        {
            path = path + nclimb(n-i,jumps+"J"+i);
        }
        return path;
    }

}
