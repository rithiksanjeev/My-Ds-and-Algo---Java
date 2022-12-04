package Day2;

public class array {
    public static void main(String args[])
    {
        //syntax of array
        int arr[] = new int[10];
        System.out.println(arr);// stores startting address

        // why array starts with zero below explanation:
        //[10,20,30,40,50,60] //address->[4000,4004,4008,4012] -> array is 4 bytes
        // arr[3] = arr + (size_of_data*index)
        // 4000(address) + (4000*0) = 4000 -> this is the reason array index start from zero
        // 4000(address) + (4000*3) = 4012 -> this would be third index

        //accessing the elements in an array
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        //update
        arr[1] = 10;
        arr[3] = arr[5];
        //display array elements
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("array values:"+arr[i]);
        }
    }
    
}
