public class starpatter1 {
    public static void main(String args[])
    {
        int n=10;

        //     * * * * *  * * * * * - 10 (1st row -0 gaps-10 starts) 2^1
        //     * * * * 5 6 * * * * - 8   (2nd row - 2gaps - 8 stars) gaps= 2^row(1) 2^2
        //     * * * 4 5 6 7 * * *- 6    (3rd row - 4gaps - 6stars) gaps= 2^row(2)=4
        //     * * 3 4 5 6 7 8 * *- 4    (4th row - 6gaps - 4stars) gaps= 2^row(3)=6
        //     * 2 3 4 5 6 7 8 9*- 2     (5th row - 8gaps - 2stars) gaps= 2^row(4)=8
        //     * 2 3 4 5 6 7 8 9 *- 2 .  (6th row - 8gaps - 2stars) gaps= 2^row(5)=10
        //     * * 3 4 5 6 7 8 * *- 4 .  (7th row - 6gaps - 4stars) gaps= 2^row(6)=12
        //     * * *4 5 6 7* * *- 6
        //     * * * * 5 6 * * * *- 8
        //     * * * * *  * * * * *- 10
        int gaps_start=n/2+1;
        int gaps_end=gaps_start;
        for(int row=1;row<=n;row++){
            for (int col=1;col<=(n);col++){
                if(col >= gaps_start && col < gaps_end)
                 System.out.print(col);
                else
                 System.out.print("*");
            }
            System.out.println();
            if(row < n/2){
                gaps_start= gaps_start-1; // 6
                gaps_end = gaps_end+1; // 7
            }
            else if(row == n/2)
            {
                gaps_start = gaps_start;
                gaps_end = gaps_end;
            }
            else{
                gaps_start= gaps_start+1;
                gaps_end = gaps_end-1;
            }
           
        }

    }
}
