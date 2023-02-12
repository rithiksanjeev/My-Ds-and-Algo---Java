package Recursionstrings;

public class removechar {
    public static void main(String[] args) {
        // String s ="baccad";
        // int index =0;
        // System.out.println(removechar(s,"",index));
          String s1= "asdaapplas";
        //System.out.println(removeapple(s1));
        System.out.println(skipchar(s1));
    }    

    static String skipchar(String s)
    {
        if(s.isEmpty())
        {
            return "";
        }

       if(s.charAt(0) != 'a')
       {
         return  s.charAt(0) + skipchar(s.substring(1));
       }
       else
       {
        return skipchar(s.substring(1));
       }
    }

    static String removeapple(String s)
    {
        if(s.isEmpty())
        {
            return "";
        }
        if(s.startsWith("app") && !s.startsWith("apple"))
        {
            return removeapple(s.substring(3));
        }
        else
        {
            return s.charAt(0) + removeapple(s.substring(1));
        }
    }

    static String removechar(String s,String newstring,int index)
    {
        if(index == s.length())
        {
            return newstring;
        }
        if(s.charAt(index) != 'a')
        {
            newstring = newstring + s.charAt(index);
        }
        return removechar(s,newstring,index+1);
    }

    static void skip(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if(ch == 'a')
        {
            skip(p, up.substring(1));
        }
        else
        {
            skip(p+ch, up.substring(1));
        }
    }

  
}
