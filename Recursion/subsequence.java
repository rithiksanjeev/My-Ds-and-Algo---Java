package Recursion;

import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
        int arr[] = {3,1,2};
        ArrayList<Integer> al = new ArrayList<>();
        subseq(arr,0,al);
    }

    public static void subseq(int arr[],int idx,ArrayList<Integer> al)
    {
        if(idx == arr.length)
        {
            System.out.println(al);
            return;
            
        }
  
             //pick condition
             al.add(arr[idx]);
             subseq(arr,idx+1,al);
             //not pick
             al.remove(al.size() - 1);
             subseq(arr, idx+1, al);
            
             
        
    }
}
