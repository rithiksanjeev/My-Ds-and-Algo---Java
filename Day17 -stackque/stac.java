import java.util.Stack;
public class stac {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        //operations
        //Push, pop, peek

        //add a element to a stack
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println("size of the stack");
         // we can see the total no of elemets/size of the stack
         int len = st.size();
         System.out.println(len);

        //read element from the stack
        //1st way is -> you can simply read the element
        System.out.println("reading from stack");
        System.out.println(st.peek()); //read element at top
        len = st.size();
        System.out.println(len);
        //2nd way
        System.out.println("poping from stack");
        System.out.println(st.pop()); // this will read as well as remove/extract element from the stack
        len = st.size();
        System.out.println(len);
        //boolean
        System.out.println("boolean values");
        boolean flag = st.isEmpty();
        System.out.println(flag);
       
    }
}
