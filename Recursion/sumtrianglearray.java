package Recursion;

import java.sql.Array;
import java.util.Arrays;

public class sumtrianglearray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        sumtriangle(arr);
    }    

    static void sumtriangle(int arr[])
    {

       if(arr.length <1)
       {
        return;
       }

       int temp[]= new int[arr.length-1];
       for(int i=0;i<arr.length-1;i++)
       {
        int sum = arr[i] + arr[i+1];
        temp[i] = sum;
       }
       sumtriangle(temp);
       System.out.println(Arrays.toString(arr));
    }
}
