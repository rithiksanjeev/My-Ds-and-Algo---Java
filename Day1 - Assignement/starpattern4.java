public class starpattern4 {
    public static void main(String args[])
    {
        //Q No.4
            // * 
            // * * 
            // * * * 
            // * * * * 
            // * * * * * 
            // * * * * 
            // * * * 
            // * * 
            // * 
        int n=10;
        int start=1;
        for (int row=1;row<=n;row++)
        {
            start =row;
            if(row > 5)
            {
                start = n-row;
            }
            for(int col=1;col<=start;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
