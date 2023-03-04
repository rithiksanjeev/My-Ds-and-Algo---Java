import java.util.*;
public class set {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        //adding to hashset only unique elements
        hs.add(10);
        hs.add(20);
        hs.add(30);
        
        // to remove an element from hashmap
        hs.remove(20);
        // we can read entire hashset
        // no control on order of hashset
        System.out.println(hs);

        // we can figure out the size of the hashset

        int len = hs.size();
        System.out.println(len);

        // we can check whether a element is present in the hashset or noe
        boolean flag = hs.contains(10);
        System.out.println(flag);
        boolean flag1 = hs.contains(50);
        System.out.println(flag1);
        int arr[] = {1,2,3,4,3};
        System.out.println("the array contains dup element "+containsdup(arr));
    }
    public static boolean containsdup(int arr[])
    {

        HashSet<Integer> hs = new HashSet<>();
        //initial version
        // int size = arr.length;
        // for(int nums:arr)
        // {
        //     hs.add(nums);
        // }
        // return hs.size() != size;
        // optimise for some best case
        for(int nums:arr)
        {
            if (hs.contains(nums));
            {
                return false;
            }
            
        }
        return true;  
    }
}
