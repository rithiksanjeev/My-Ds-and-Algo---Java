import java.util.Stack;
public class duplicateparathesis {
    public static void main(String[] args) {
        String s = "(a + b) + ((c + d)) ";
        boolean check = findduplicate(s);
        System.out.println(check);
    }

    static boolean findduplicate(String s)
    {
        Stack<Character> st = new Stack<>();
        for(int i=0;i < s.length()-1;i++)
        {
            if(s.charAt(i) != ')')
            {
                st.push(s.charAt(i));
            }
            else
            {
                char top = st.peek();
                st.pop();
                int elementsInside = 0;
                while(top != '(')
                {
                    elementsInside++;
                    top = st.peek();
                    st.pop();
                }
                if(elementsInside < 1)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
