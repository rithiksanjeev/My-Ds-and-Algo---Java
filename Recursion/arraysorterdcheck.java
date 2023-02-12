package Recursion;

public class arraysorterdcheck {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        boolean ans = sortedcheck(arr,0,1);
        System.out.println(ans);
    }
    static boolean sortedcheck(int arr[],int start,int next)
    {
        if(start == arr.length-1)
        {
            return true;
        }
        if(arr[start] < arr [next])
        {
            return sortedcheck(arr,start+1,next+1);
        }
        else{
            return false;
        }
    }
    
}
