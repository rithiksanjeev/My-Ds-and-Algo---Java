package Recursiondailyrevise;

import java.util.ArrayList;

public class subsets {
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        ArrayList<Integer> al = new ArrayList<>();
        generatesub(nums,0,al);

    }
    
    public static void generatesub(int[] up,int index,ArrayList<Integer> al)
    {
       
        if(index == up.length)
        {
            System.out.println(al);
            return;
        }
        al.add(up[index]);
        generatesub(up,index+1,al);
        al.remove(al.size()-1);
        generatesub(up,index+1,al);
    }
}
