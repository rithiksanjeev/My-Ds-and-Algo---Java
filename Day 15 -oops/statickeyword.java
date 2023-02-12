public class statickeyword {

    static class student {
        String name;
        static String College = "skcet"; 
        String dept;
        int roll;
        int age;
    }
    public static void main(String[] args) {
        // static is not the data member of an object it is data membrer of class
        String temp = student.College; // able to access without object creation and also this proves memory is getting created for class
        System.out.println(temp);
        student s2 = new student(); // object creation
        String temp2 = s2.College; // this is not the right practice since it will affect other object also
        System.out.println(temp2);
    }
}
