import java.util.Scanner;

public class linked {
    class node { // userdefineddatatype
        int data;
        node next;
        node(){}
        node(int data)
        {
            this.data = data;
            this.next = null;
        }

        node(int data,node next)
        {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        node head = createll();
    }

    public static void display(node head)
    {
        node curr = head;
        while(curr != null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static void insertfirst(node head,int data)
    {
        node first = new node();
        first.next = head;
    }

    public static void insertlast(node head)
    {
        node last = new node(10);
        node curr = head;
        while(curr.next != null)
        {
            curr = curr.next;
        }
        curr.next = last;
    }

    public static void insertany(node head)
    {
        node insertval = new node(10);
        node frwd = new node(10);
        node curr = head;
        int pos =3;
        int count =0;
        while(curr.next != null)
        {
            count = count +1;
            if(count == pos)
            {
                frwd = curr.next;
                curr.next = insertval;
                curr.next.next = frwd;
                break;
            }
            curr = curr.next;
            
        }
    }
    public static node createll()
    {
        Scanner scn = new Scanner(System.in);
        //take the first element
        int temp = scn.nextInt();
        if(temp == -1) return null;
        node head = new node(temp);
        node pre = head;

        while(true)
        {
            temp =scn.nextInt();
            if(temp ==-1)
            {
                break;
            }
        }
        return head;
    }
}
