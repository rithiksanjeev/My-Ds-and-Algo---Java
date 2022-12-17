public class matrix {
    public static void main(String[] args){
        int arr[][] =new int[5][];
        arr[0]=new int[101];
        arr[1]=new int[20];
        arr[2]=new int[1012];
        arr[3]=new int[101111];
        arr[4]=new int[1011];
        for(int i=0;i<arr.length;i++)
        {
            display(arr[i]);
        }
    }
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++)
        {
            System.out.print((i+1)+"");
        }
        System.out.println();
    }

    // Display of matrix
    public static void display2D(int arr[][]){
        for(int ele[]:arr){ //for each loop || accessing the individtal arrays from 2-d array
            display(ele); //displaying th individaul array
        }
    }

    //display the 2D array using matrix concept
    public static void displaymatrix(int arr[][]){
        for (int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.println(arr[row][col]+" ");
            }
        }
    }
}
