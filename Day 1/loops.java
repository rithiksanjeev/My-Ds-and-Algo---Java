public class loops {
    // same task to be done again and again
    public static void main(String[] args)
    {
         //There ate 3 main elements of any typr of loop:
    //intialization (of the condtion)
    //condtion check ->work -> updation of condtion
    /*
        Types of loops
        1.for loop
        2.While loop
        3.do while loop
        4.for each loop(after array and arraylist)
     */ 
        // init of condition
        // while(true){
        //     //work will be done
        //     // update the work
        // }
        int count = 1; // init of condition
        while(count <= 5){ // run till true
            System.out.println("Good Morning,Rithik"); //work will be done
            ++count; // update the work
        }
        //for loop
        for(int x=1;x<=5;x++){
            System.out.println("Good morning");
        }
    }
   

}
