package Recursion;

import java.util.ArrayList;

public class minmaxrec {
    public static void main(String[] args) {
        int arr[]= {1, 4, 3, -5, -4, 8, 6};
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(minmax(arr,0,list));
    }    
    static int max = 999999;
    static int min =-9999;
    static ArrayList minmax(int arr[],int first_index,ArrayList<Integer> list)
    {
        
        if (first_index == arr.length-1)
        {
            list.add(min);
            list.add(max);
            return list;
        }
        if(arr[first_index] < arr[first_index+1])
        {
            max = arr[first_index+1];
            min = arr[first_index];
            return minmax(arr,first_index+1,list);
        }
        return minmax(arr,first_index+1,list);
    }
}
