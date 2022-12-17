public class wavetraversal {
        public static void main(String args[])
        {
            int arr[][]= {{1,2,3,4,5},
                          {6,7,8,9,10},
                          {11,12,13,14,15},
                          {16,17,18,19,20}
                                };
            wavetraversals(arr);             
        }

        public static void wavetraversals(int arr[][]){
            // take a flag
            boolean tb = true; // top to bottom

            // traverse the matrix in col wise
            for(int col =0; col < arr[0].length;col++){
                // there are two possible scenarios
                //if tb
                if(tb){
                    //travel the row in increasing order
                    for (int row =0;row< arr.length;row++)
                    {
                        System.out.print(arr[row][col] + " ");
                    }
                     tb= false;
                }
                else
                {
                    for (int row = arr.length-1;row>=0;row--)
                    {
                        System.out.print(arr[row][col] + " ");
                    }
                    tb= true;
                }
                System.out.println();
            }
        }
}   
