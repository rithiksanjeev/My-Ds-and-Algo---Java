package Day10;

public class subsequence {
    public static void main(String args[])
    {

        subsequence("abcd",0,"");
    }

    public static void subsequence(String str,int idx,String sfs)
    {
        //base case
        if(idx == str.length())
        {
            System.out.println(sfs);
            return;
        }
        //two options
        //pick

        char ch = str.charAt(idx);
        subsequence(str,idx+1,sfs+ch);

        // the second choice
        subsequence(str,idx+1,sfs+'-');
    }
}
