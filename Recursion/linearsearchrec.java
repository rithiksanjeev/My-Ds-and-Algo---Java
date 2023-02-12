package Recursion;

import java.lang.annotation.Target;
import java.util.ArrayList;

public class linearsearchrec {
    public static void main(String[] args) {
        int arr[] = {3,2,1,18,18,19};
        int target = 18;
        // botom up
        // return multiple occurence
        
       // search(arr,target,arr.length-1);
        //System.out.println(al);
        ArrayList<Integer> al =new ArrayList<>();
        //search1(arr,target,arr.length-1,al);
        System.out.println(search2(arr,target,arr.length-1));
    }    
    static ArrayList<Integer> al =new ArrayList<>();
    static void search(int arr[],int target,int index){
       
        if(arr[index] == target)
        {
            al.add(index);
        }
        if(index == 0)
        {
            return ;
        }
        else
        {
            search(arr,target,index-1);
        }
    }

    static ArrayList search1(int arr[],int target,int index,ArrayList<Integer> al){
       
        if(arr[index] == target)
        {
            al.add(index);
        }
        if(index == 0)
        {
            return al;
        }
        else
        {
            return search1(arr,target,index-1,al);
        }
    }

    static ArrayList search2(int arr[],int target,int index){
        ArrayList<Integer> al =new ArrayList<>();
        if(arr[index] == target)
        {
            al.add(index);
        }
        if(index == 0)
        {
            return al;
        }
        else
        {
            ArrayList<Integer> ansfromcalls =  search2(arr,target,index-1);
            al.addAll(ansfromcalls);
            return al;
        }
    }
}

