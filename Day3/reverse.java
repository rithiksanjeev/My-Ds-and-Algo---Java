public class reverse {

    public static void main(String args[])
    {
        int arr[]= {1,2,3,4,5}; //50,40,30,20
        int arr2[] = {6,7,8,9,4};
        //reverses(arr);
        //rotate(arr,2);
        //inverse(arr);
        addtwoarrayclassapp(arr,arr2);
    }
    public static void reverses(int arr[],int start,int end)
    {
        // two pointer approach
        // int start = 0;
        // int end = arr.length-1;
        // int temp =0;
        // for(int idx=0;idx<=arr.length/2;idx++)
        // {
        //     temp = arr[start];
        //     arr[start] = arr[end];
        //     arr[end] = temp;
        //     start =start+1;
        //     end = end-1;
        // }
        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }

        display(arr);
    }
    public static void swap(int arr[],int i, int j)
    
    {
        int temp=0;
        temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    public static void rotate(int arr[],int k){
        int st1=0;
        int end1 = arr.length -k -1;
        int st2 =end1+1;
        int end2 = arr.length-1;
        //reverse first half
        reverses(arr,st1,end1);
        //reverse secod half;
        reverses(arr, st2, end2);
        //reverse complet
        reverses(arr, st1, end2);
    }
    public static void inverse(int arr[])
    {   
        int new_arr[] = new int[arr.length];
        for(int idx=0;idx< arr.length;idx++)
        {
            new_arr[arr[idx]] = idx;
        }
        display(new_arr);
    }
    public static void display(int arr[])
    {
        for(int idx=0;idx<arr.length;idx++)
        {
            System.out.println(arr[idx]);
        }
    }
    public static void addtwoarraymyapp(int arr[],int arr2[])
    {
        int carry_val =0;
        int counter = 0;
        int sum=0;
        int new_arr[] = new int[arr.length];
        for(int idx1=arr.length-1;idx1>=0;idx1--)
        {
                 sum = arr[idx1]+arr2[idx1]+carry_val;
                 new_arr[idx1] = sum %10;
                 carry_val = sum /10;
        }
        display(new_arr);
    }
    public static void addtwoarrayclassapp(int arr[],int arr2[])
    {
        int ans[] = new int[Math.max(arr.length,arr2.length)+1];
        int i=arr.length-1,j=arr2.length-1,k=ans.length-1;
        int c=0;
        while (i>=0 ||j>=0){
            int num = c;
            if(i>=0)
                num = num + arr[i];
            if(j>=0)
                num = num + arr2[j];
            ans[k]= num%10;
            c= num/10;
            i--;
            j--;
            k--;
        }
        if(c!=0)
          ans[k]= c;       
        display(ans);
    }
    public static void subtwoarrayclassapp(int arr[],int arr2[]){
        int ans[] = new int[Math.max(arr.length,arr2.length)+1];
        int i=arr.length-1,j=arr2.length-1,k=ans.length-1;
        int c=0;
        while (i>=0){
            int num = c;
                num = num + arr[i];
            if(j>=0){
                if(num < arr2[j]){
                    num = num+10;
                    c=c-1;
                }
                num = num - arr2[j];
            }
            ans[k]=num;
            i--;
            j--;
            k--;
        }  
        displaysub(ans);
    }
    public static void displaysub(int arr[])
    {
        int i=0;
        while(arr[i] == 0 && i<arr.length)
            i++;
        for(int idx=i;idx<arr.length;idx++)
        {
            System.out.println(arr[idx]);
        }
    }
}

