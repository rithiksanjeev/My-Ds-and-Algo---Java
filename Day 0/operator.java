import java.text.NumberFormat.Style;

public class operator {
    public static void main(String[] args){

        //operators
        /*
           Arithmetic operator
           Comparison operator
           Equality
           Logical operators
           Assignement operators
           Unary operators
           bitwise operator
        */
        // Arithmetic operator + - * / %
        int a =10;
        int b = 20;
        String str1 = "Rithik";
        String str2 = "sanjeev";
        int sub = a-b;
        int mul = a*b;
        int plus = a+b;
        String newstr= str1+str2; // join the two strings || concatenate || only in java (whole new memory will be created) - str1 will be deleted by garbage collector once assigned to new str

        // / %
        int x = 99;
        int y =10;
        int quotient = x/y;
        int remainder = x%y;

        // Assignement operators
        System.out.println("Assignement opertors:"); // 11
        int xx =10;
        xx = xx +20; //1st way
        xx += 10; // first add and then assign
        xx -=10; //first sub and sub
        xx *= 10; //
        xx /=10;
        xx %=10;
        System.out.println(xx);

        //relational operator -> Equality || comparison
        System.out.println("relational opertors:"); // 11
        boolean flag = (a==b);
        flag = (a<b);
        flag = (a<=b);
        flag = (a>=b);
        flag = (a!=b);
        System.out.println(flag);

        // Logical -> unary -> if else -> ternary operator
        // if raining i have gram flour then i will cook pakoda
        System.out.println("Logical opertors:"); // 11
        flag = (a==10) && (b==20);
        flag = (a==30) || (b==20);
        flag  = (a==30) || (b==20);
        System.out.println(flag);

        // unary opertors
        System.out.println("unary opertors:"); // 11
        //pres & post || increment decrement
        // post - first assign and then do action
        // pre - first action then assign
        a =10;
        int cc = a++;
        System.out.println(a); // 11
        System.out.println(cc);//10
        a =10;
        cc = ++a;
        System.out.println(a); // 11
        System.out.println(cc); //11

    }
}
