public class star {
    public static void main(String args[])
    {
        int n=5;
        // first loop for iteration over the rows,or just each line
        for(int row =1;row<=n;row++){
            //now for every row,i have to do some task
            // for that.i will use another loop
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
