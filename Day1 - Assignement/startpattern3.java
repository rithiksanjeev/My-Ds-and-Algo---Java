public class startpattern3 {
    // Q. No 3)


    //     7 6 5 4 3 2 1 0 
    //     6 5 4 3 2 1 0   
    //     5 4 3 2 1 0     
    //     4 3 2 1 0       
    //     3 2 1 0         ja
    //     2 1 0           
    //     1 0             
    //     0 
    public static void main(String args[])
    {
        int n= 8;
        for(int row=n-1;row>=0;row--)
        {
            for(int col=row;col>=0;col--)
            {
                System.out.print(col);
            }
            System.out.println();
        }
    }    
}
