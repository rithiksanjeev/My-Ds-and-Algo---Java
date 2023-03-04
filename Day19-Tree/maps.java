import java.util.*;

public class maps {
    public static void main(String[] args) {

        //similar to hashset it is stored in diffrent order
        HashMap<String,Integer> hm = new HashMap<>();
        //add value in hashmap
        hm.put("india", 100000);
        hm.put("uk", 100123);
        hm.put("china", 100123);
        hm.put("malasyia", 1001);
       
        System.out.println(hm);

        System.out.println(hm.get("india"));

        // if we add a pair ,whose val is already in hashmap val will get updated
        hm.put("india", 10001200);
        System.out.println(hm);

         //remove key in hashmap
         System.out.println(hm.remove("india"));
    
        // in hashset we where checking elemetn is present or not
        // here in hashmap we can check if the key is present or not
        System.out.println(hm.containsKey("india"));

        // we can check the size of the map
        System.out.println(hm.size());

        //iterating
        System.out.println("Iterating Hashmap...");  
        for(Map.Entry m : hm.entrySet()){    
            System.out.println(m.getKey()+" "+m.getValue());    
         }
         int arr[]= {1,2,3,4,5,2,5,5};
         GetFrequency(arr);
         anagram("listen","silent");
         int arr1[]= { 1, 2, 3, 4, 5, 6, 7 };
         int arr2[]= {1, 3, 4, 5, 6, 9, 8};
         GetuniqueCommonelements(arr1,arr2);
         GetCommonelements(arr1,arr2);
    }

    public static void GetFrequency(int arr[])
    {
        // Get frequenct of all unique elements
        //[1,2,3,4,5,2]
        // value is the frequency
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int ele:arr)
        {
            if(hm.containsKey(ele))
            {
                int prev_fre = hm.get(ele);
                int new_fre = prev_fre+1;
                hm.put(ele,new_fre);

                //hm.put(ele,(hm.get(ele)+1))
            }
            else
            {
                hm.put(ele,1);
            }
           
        }
        for(int ele:hm.keySet())
        {
            System.out.println(ele+"->"+hm.get(ele));
        }
        System.out.println(hm);
    }

    public static void anagram(String a, String b)
    {
        HashMap<Character,Integer> hm1 = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();

        for(char ch:a.toCharArray())
        {
            if(hm1.containsKey(ch))
            {
                hm1.put(ch,hm1.get(ch)+1);
            }
            else
            {
                hm1.put(ch,1);
            }
        }

        for(char ch:b.toCharArray())
        {
            if(hm2.containsKey(ch))
            {
                hm2.put(ch,hm2.get(ch)+1);
            }
            else
            {
                hm2.put(ch,1);
            }
        }
        if(hm1.equals(hm2))
        {
            System.out.println("anagram");
        }
        else
        {
            System.out.println("not anagram");
        }
    }

    public static void GetuniqueCommonelements(int a1[],int a2[])
    {
        //figure out unique common elements in a1 and a2
        //a1 = [1,2,1,1] || [1,2,1,3] -> 1,2
        // int arr1[]= {1,2,1,1};
        // int arr2[]= {1,2,1,3};
        HashSet<Integer> hm1 = new HashSet<>();
        //put all elemetns into hashset
        for(int num:a1)
        {
            hm1.add(num);
        }
        System.out.println(hm1);
        for(int num:a2)
        {
            if(hm1.contains(num))
            {
                System.out.println(num);
                hm1.remove(num);
                System.out.println(hm1);
            }
        }
       
    }

    public static void GetCommonelements(int a1[],int a2[])
    {
        //figure out unique common elements in a1 and a2
        //a1 = [1,2,1,1] || [1,2,1,3] -> 1,2
        // int arr1[]= {1,2,1,1};
        // int arr2[]= {1,2,1,3};

        // first make the frequency table
        // then iterate over the second array
        // if(present)
        // print and reduce the frequency
        HashSet<Integer> hm1 = new HashSet<>();
        //put all elemetns into hashset
        for(int num:a1)
        {
            hm1.add(num);
        }
        System.out.println(hm1);
        for(int num:a2)
        {
            if(hm1.contains(num))
            {
                System.out.println("elements"+num);
            }
        }
       
    }
}
