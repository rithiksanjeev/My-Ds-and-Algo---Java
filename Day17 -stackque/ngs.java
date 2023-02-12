import java.util.Stack;
public class ngs {

    public static void main(String[] args) {
        int arr[] = {2,5,9,3,1,12,6,8,7};
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i] + " ");
        }
        //ngtl(arr);
       // ngtl2(arr);
       ngtl2stackleft(arr);
    }

    public static void ngtl(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            boolean flag = false;
            for(int j =i-1 ;j>=0 ;j--)
            {
                if(arr[j] > arr[i])
                {
                    flag=true;
                    System.out.println("Next greater element for "+arr[i]+" is "+arr[j]);
                    break;
                }
            }
            if(!flag)
            {
                System.out.println("Next greater element for "+arr[i]+" is "+-1);
            }
        }
    }

    public static void ngtl2(int arr[])
    {
        int greatest = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] > arr[i-1] && arr[i] > greatest)
            {
                System.out.println("Next greater element for "+arr[i]+"is -1");
            }
            else
            {
                greatest = arr[i-1];
                System.out.println("Next greater element for "+arr[i]+" is "+greatest);
            }
        }
    }

    public static void ngtl2stackleft(int arr[])
    {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while(!st.empty() && st.peek() < arr[i])
            {
                st.pop();
            }
            if(st.empty())
            {
                System.out.println("Next greater element for "+arr[i]+"is -1");
            }
            else
            {
                System.out.println("Next greater element for "+arr[i]+" is "+st.peek());
            }
            //push current element to the stack for next comparisions
            st.push(arr[i]);
        }
    }

    public static void ngtl2stackright(int arr[])
    {
        Stack<Integer> st = new Stack<>();
        for(int i=arr.length-1;i >=0 ;i--)
        {
            while(!st.empty() && st.peek() < arr[i])
            {
                st.pop();
            }
            if(st.empty())
            {
                System.out.println("Next greater element for "+arr[i]+"is -1");
            }
            else
            {
                System.out.println("Next greater element for "+arr[i]+" is "+st.peek());
            }
            //push current element to the stack for next comparisions
            st.push(arr[i]);
        }
    }

    public static void ngsl2stackleft(int arr[])
    {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while(!st.empty() && st.peek() > arr[i])
            {
                st.pop();
            }
            if(st.empty())
            {
                System.out.println("Next greater element for "+arr[i]+"is -1");
            }
            else
            {
                System.out.println("Next greater element for "+arr[i]+" is "+st.peek());
            }
            //push current element to the stack for next comparisions
            st.push(arr[i]);
        }
    }

    public static void ngs2stackright(int arr[])
    {
        Stack<Integer> st = new Stack<>();
        for(int i=arr.length-1;i >=0 ;i--)
        {
            while(!st.empty() && st.peek() > arr[i])
            {
                st.pop();
            }
            if(st.empty())
            {
                System.out.println("Next greater element for "+arr[i]+"is -1");
            }
            else
            {
                System.out.println("Next greater element for "+arr[i]+" is "+st.peek());
            }
            //push current element to the stack for next comparisions
            st.push(arr[i]);
        }
    }
    
}
