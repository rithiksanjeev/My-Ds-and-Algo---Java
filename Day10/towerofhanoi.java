package Day10;

public class towerofhanoi {
    // all permutations and all comninations use recursion
    public static void main(String args[])
    {
        int n=3;
        toh(n,"T1","T2","T3");
    }

    public static void toh(int n,String src,String help,String dest)
    {
        if(n ==0) return;
        //first task -> move n-1 disk from src to helper taking dest as helper
        toh(n-1,src,dest,help);
        System.out.println("Move "+n+"th disk from "+src+"to"+dest);
        toh(n-1,help,src,dest);
    }
}
