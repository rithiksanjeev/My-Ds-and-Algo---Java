import java.util.Scanner;

public class hello {
    public static void main(String[] args) {

        // variables
        // int a = 10;
        // String str = "rithik";
        // boolean flag= true;
        // char ch = '&';

        // output statement
        System.out.println("welcome");

        System.out.println("next");
        
        // input statement
         Scanner scn = new Scanner(System.in);// fot taking inputs - pre defined class
         int a = scn.nextInt(); // take integer input
         int b = scn.nextInt(); // take integer input
         String str = scn.nextLine();// take string input

         System.out.println("value of a"+a);
         System.out.println("value of b"+b);
         System.out.println("value of str"+str);


    }
}
