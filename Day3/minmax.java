public class minmax {
    public static void main(String[] args){
        int arr[] = {10,20,40,40,10,2,2};
       // max(arr);
       // int val = min(arr);
       int val2 = first_max(arr);
       System.out.println("index for first min is"+val2);
       int val1 = first_min(arr);
       System.out.println("index for first min is"+val1);
       int val = last_min(arr);
       System.out.println("index for last min is"+val);
       int val_3 = last_max(arr);
       System.out.println("index flor last max is"+val_3);
    }

    public static int first_max(int arr[])
    {
        int max=arr[0];

        for(int idx=1;idx<arr.length;idx++){
            if(arr[idx] > max){
                max = arr[idx];
            }

            //max = Math.max(Arr[idx],max);
        }
        return max;

    }
    // return index of minium element
    public static int first_min(int arr[])
    {
        int min=arr[0];
        int minimum= 0;
        int index = 0;
        for(int idx=1;idx<arr.length;idx++){
            if(arr[idx] < min){
                min = arr[idx];
                index = idx;
            }

            //minimum = Math.min(arr[idx],min);
        }
        System.out.println("value is"+min);
        System.out.println("using inbuilt"+minimum);
        return index;

    }

    // retrun first occurenece
    public static int last_min(int arr[])
    {
        int min=arr[0];
        int minimum= 0;
        int index = 0;
        for(int idx=1;idx<arr.length;idx++){
            if(arr[idx] <= min){
                min = arr[idx];
                index = idx;
            }

            //minimum = Math.min(arr[idx],min);
        }
        System.out.println("value is"+min);
        System.out.println("using inbuilt"+minimum);
        return index;

    }

    public static int last_max(int arr[])
    {
        int min=arr[0];
        int minimum= 0;
        int index = 0;
        for(int idx=1;idx<arr.length;idx++){
            if(arr[idx] >= min){
                min = arr[idx];
                index = idx;
            }

            //minimum = Math.min(arr[idx],min);
        }
        System.out.println("value is"+min);
        System.out.println("using inbuilt"+minimum);
        return index;

    }
}
