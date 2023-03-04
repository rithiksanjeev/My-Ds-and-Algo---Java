package Day20;

public class sorting {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        //bubble(arr);
        // bubbleclass(arr);
        // display(arr);
        insertsort(arr);
        display(arr);
    }
    public static void bubble(int[] arr)
    {
        for(int itr=0;itr<arr.length;itr++)
        {
            int i =0;
            int j= 1;
            while(i<j && j < arr.length)
                {
                    if(arr[i] > arr[j])
                    {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                    i= i+1;
                    j= j+1;
                }
        }
        for(int ele:arr)
        {
            System.out.println(ele);
        }
        
    }

    public static void bubbleclass(int[] arr)
    {
        int n = arr.length;
        for(int itr=0;itr<n;itr++)
        {
          for(int curr =0;curr<n-itr-1;curr++)
          {
             if(isGreater(arr,curr,curr+1))
             {
                swap(arr,curr,curr+1);
             }
          }
        }  
    }

    public static void insertsort(int[] arr)
    {
        for(int i = 1;i<arr.length;i++) // by default we assume first element is sorted
        {
            //pick first element in unsorted region and travel back in sorted region
            for(int j = i-1;j>=0;j--) 
            {
                if(isGreater(arr, j, j+1)) // ([8,7,5,10,4,6] , arr[0](8) ,arr[1](7))
                {
                    swap(arr,j, j+1);
                }
                else
                {
                    break;
                }
            }
                
        }
    }

    public static void selectionsort(int[] arr)
    {
        int n = arr.length;
        for(int i=0;i<arr.length;i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                {
                    min_idx = j;
                }
                // Swap the found minimum element with the first
                // element
                swap(arr,min_idx, i);
            
        }
    }

    public static boolean isGreater(int arr[],int i,int j)
    {
        if(arr[i] > arr[j]) return true;
        return false;
    }

    public static int[] swap(int arr[],int i,int j)
    {
        if(arr[i] > arr[j])
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    public static void display(int arr[])
    {
        for(int ele:arr)
        {
            System.out.println(ele);
        }
    }
       
}
