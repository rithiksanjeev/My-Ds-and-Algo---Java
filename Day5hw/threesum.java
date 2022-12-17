package Day5hw;

public class threesum {
    
    public static void main(String args[])
    {
        // https://learnersbucket.com/examples/algorithms/3-sum-problem-algorithm/#:~:text=Given%20an%20array%20of%20integers,as%203%20sum%20problem%20algorithm.
        int arr[] = {1, 2, 3, 5, 6, 11, 15, 16, 17, 18};
        threesums(arr,20);
    }
    public static void threesums(int nums[],int target)
    {
        int sum=0;
        int[] arr1 = new int [3];
        for(int st=0;st<nums.length-1;st++)
            {
            for(int next=st+1;next< nums.length;next++)
                {
                 for(int next_nex=next+1;next< nums.length;next++)
                 {
                    sum = nums[st] + nums[next] +nums[next_nex];
                    boolean is_matched = checktarget(target,sum);
                    if(is_matched)
                    {
                        System.out.println(sum);
                        arr1[0]= st;
                        arr1[1] =next;
                        arr1[2] =next_nex;
                        st = nums.length-1;
                        break;
                    }
                }
                }
            }
            System.out.println("index is"+arr1[0]+"value is"+nums[arr1[0]]);
            System.out.println("index is"+arr1[1]+"value is"+nums[arr1[1]]);
            System.out.println("index is"+arr1[2]+"value is"+nums[arr1[2]]);
    }
    public static boolean checktarget(int target,int sum)
    {
        if(target == sum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
