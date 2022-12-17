public class twosum {
        public static void main(String[] args)
        {
            // https://leetcode.com/problems/two-sum/description/
            int nums[] ={2,7,11,15};
            int target=9;
            int[] arr = new int [2];
            int sum=0;
            for(int st=0;st<nums.length-1;st++)
            {
                for(int next=st+1;next< nums.length;next++)
                {
                    sum = nums[st] + nums[next];
                    boolean is_matched = checktarget(target,sum);
                    if(is_matched)
                    {
                        arr[0]= st;
                        arr[1] =next;
                        st = nums.length-1;
                        break;
                    }
                }
            }
            System.out.println(arr[0]+" "+arr[1]);
            System.out.println(nums[0]+" "+nums[1]);
            
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
