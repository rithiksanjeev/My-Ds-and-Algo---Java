package Recursion;

public class countzero {
    public static void main(String[] args) {
        int ans = countz(1030101,0);
        System.out.println(ans);
    }

    static int countz(int n,int count)
    {
        if(n==0)
        {
            return count;
        }
        if(n%10 == 0)
        {
            return countz(n/10,count+1);
        }
        else{
            return countz(n/10,count);
        }
        
    }
}
