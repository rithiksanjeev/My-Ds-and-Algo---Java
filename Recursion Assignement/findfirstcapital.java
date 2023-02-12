public class findfirstcapital {
    public static void main(String[] args) {
        findcap("geekS",0);
    }

    static void findcap(String s,int index)
    {
        if(index == s.length())
        {
            return;
        }
        char ch = s.charAt(index);
        if(ch >= 'A' && ch <= 'Z')
        {
            System.out.println(ch);
        }
        else
        {
            findcap(s,index+1);
        }
    }
}
