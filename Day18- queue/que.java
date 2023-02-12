import java.util.ArrayDeque;
import java.util.Queue;
public class que {

    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        System.out.println(q);
        System.out.println("First elemetnt "+q.peek());
        System.out.println("size "+q.size());
        System.out.println("First element "+q.poll());
        System.out.println(q);
        System.out.println("size "+q.size());
        System.out.println("First element "+q.peek());
        System.out.println(q);
    }
    
}
