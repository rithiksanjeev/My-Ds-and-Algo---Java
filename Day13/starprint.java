package Day13;

public class starprint {
    public static void main(String args[])
    {
        pt(5);
        //printstars(5);
    }

    public static void pt(int n)
    {
        int nst1=n;
        int nst2=n;
        int nsp=0;
        for(int row=1;row<=n*2;row++)
        {
            if(row<=n)
            {
                printstars(n);
                nst1 = nst1 -1;
                printspaces(nsp);
                nsp = nsp +2;
            }
        }
    }

    public static void printstars(int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("*");
        }
        
    }

    public static void printspaces(int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(" ");
        }
    }
}
