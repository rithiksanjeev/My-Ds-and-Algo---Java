public class Condition {
    public static void main(String[] args) {
           
        //if else , else if
            boolean raining = true; 
            boolean beshan = false; 
            if (raining)
            System.out.println("enjoy raining alone");
            else if (beshan)
            System.out.println("wat pakoda");
            else if (raining ||beshan )
            System.out.println("eat pakoda or enjoy pakoda");
            else if (raining && beshan )
            System.out.println("eat pakoda and enjoy rain");
            else
            System.out.print("no cook");
        
        // if else
           int xy =10;
           if (xy <= 5){
               System.out.println("x is less than 10");
           }
           else{
               System.out.println("x is greater than 10");
           }
           
        //ternary (alreanative of else if)
           xy = 100;
           int xyz = (xy <= 5) ? 10 : 20; // how to add print in ternary
           System.out.println("value of xyz:-> "+xyz);


    }
}
