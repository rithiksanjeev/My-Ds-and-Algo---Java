public class compressesstring {

    public static void main(String args[])
    {
        String name = "rriitthikkr";
        frequencey(name);
    }

    public static void compressed(String name)
    {
        String ans= ""+name.charAt(0);
        for(int st=1;st<name.length();st++)
        {
            if(name.charAt(st) != ans.charAt(ans.length()-1))
            {
                ans = ans + name.charAt(st);
            }
        }
            System.out.println(ans);
    }
    public static void frequencey(String name)
    {
        //rrkkithikkk -> print frequency of k->5 ) 0(n) -> access O(1)
        // all are in lower case
        //frequency of r -> 2
        //frequency of k -> 5
        //frequency of i -> 2
        int arr[]= new int[26];
        char ch = 'k';
        for(int st=0;st<=name.length()-1;st++)
        {
            arr[name.charAt(st)-'a']++;
        }
        int pos = ch - 'a';
        System.out.println(arr[pos]);
    }
    }
    
