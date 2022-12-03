public class prime {
    public static void main(String[] args){
        //int num =4;
        //a number that can be divided exactly only by itself and 1 is prime,
        // approach 1
        // int count = 2; //intilaization
        // int is_prime = 0;
        // while(count <= 7) //condition
        // {
        //     if(num % count == 0) //work
        //     {
        //         is_prime++;
        //     }
        //     count = count+1; //update condition
        // }
        // if(is_prime == 1)
        // {
        //     System.out.println("prime");
        // }
        // else{
        //     System.out.println("not prime");
        // }

        //approach 2
        // int n=10;
        // int curr=2;
        // boolean flag=true;
        // while(curr<n){
        //     if(curr%n==0)
        //     {
        //         flag=false;
        //         break;
        //     }
        //     curr +=1;
        // }
        // if(flag == true){
        //     System.out.println("prime");
        // }
        // else{
        //     System.out.println("not prime");
        // }

        //print all prime till n -> to do using while

        //for loop
        int curr =2;
        int n=100;
        boolean flag=true;
        for (int i=1; i<=100; i++){
          curr=2;
          while(curr<n){
            if(curr%i == 0)
            {
                flag = false;
                break;
            }
            curr +=1;
          }
          if (flag == true){
            System.out.println((i));
          }

        }
        
    }
}
