import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class priorityque {
    public static void main(String[] args) {
        // how to decalre / define heap/priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // by default, the priority is given to the smaller no if reverse order give collections.reverseorder
        // putting/adding elements in the pq
        pq.add(40);
        pq.add(20);
        pq.add(50);
        System.out.println(pq.peek());
        pq.add(1);
        pq.add(10);
        
        System.out.println(pq.peek());

        // remove element from the priority queue
        pq.remove();
        System.out.println(pq.peek());
        int arr[] = {100,1,30,70,55};
        int k=3;
        kthlargest(arr,k);

        // lexicographic order
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        pq1.add("rithik");
        pq1.add("akash");
        pq1.add("vikas");
        System.out.println(pq1.peek());

    }
    
    public static void kthlargest(int arr[],int k )
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele:arr)
        {
            pq.add(ele);
        }
        for(int i=1;i<k;i++)
        {
            pq.remove();
        }
        System.out.println("ans"+pq.peek());

    }
}
