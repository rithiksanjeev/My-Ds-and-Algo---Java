import java.util.ArrayList;

public class arraylist {
    public static void main(String args[])
    {
        ArrayList<Integer> al = new ArrayList<>();// Growing and shrink in real time
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println(al);
        System.out.println(al.size()); // size for array list

        // reading the elements in array list
        al.get(2); // get for specfic index

        // read the entire arraylist
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }
        // for each is common and frequent
        for(int i:al) // for every element in the data structure
        {
            System.out.println(i);
        }

        // removeing / deleting a element in given index

        al.remove(3);

        // set .override element at given index

        al.set(4, 10); // at index 4 10 will be set
    }
}
