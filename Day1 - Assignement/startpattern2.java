public class startpattern2 {
    public static void main(String[] args){
        // Q . no 2)

        // *                  *
        // * *              * *
        // * * *          * * *
        // * * * *      * * * *
        // * * * * *  * * * * *
        // * * * * *  * * * * *
        // * * * *      * * * *
        // * * *          * * *
        // * *              * *
        // *                  *

        int n=10;
        int middle = n/2;
        int gap_start=1;
        int gap_end=n;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if(col>gap_start && col<gap_end)
                {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
            if(row < middle)
            {
                gap_start = gap_start+1;
                gap_end =gap_end-1;
            }
            else if(row == middle)
            {
                gap_start=gap_start;
                gap_end = gap_end;
            }
            else
            {
                gap_start = gap_start-1;
                gap_end =gap_end+1;
            }

                
        }
    }
    
}
