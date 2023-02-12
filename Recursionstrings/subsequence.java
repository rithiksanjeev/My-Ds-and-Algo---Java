package Recursionstrings;

import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
        //String s = "abc";
        //subseq("","abc");
        System.out.println(subseqlist("","abc"));
        System.out.println( subseqlistasci("","abc"));
    }

    static void subseq(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));
        
    }

    static ArrayList<String> subseqlist(String p,String up)
    {
       
        if(up.isEmpty())
        {
            ArrayList<String> al = new ArrayList<>();
            al.add(p);
            return al;
        }

        char ch = up.charAt(0);
        ArrayList<String> left  = subseqlist(p+ch, up.substring(1));
        ArrayList<String> right = subseqlist(p, up.substring(1));
        left.addAll(right);
        return left;
        
    }

    static ArrayList<String> subseqlistasci(String p,String up)
    {
       
        if(up.isEmpty())
        {
            ArrayList<String> al = new ArrayList<>();
            al.add(p);
            return al;
        }

        char ch = up.charAt(0);
        ArrayList<String> first  = subseqlistasci(p+ch, up.substring(1));
        ArrayList<String> second = subseqlistasci(p, up.substring(1));
        ArrayList<String> third = subseqlistasci(p+(ch+0),up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
        
    }
}
