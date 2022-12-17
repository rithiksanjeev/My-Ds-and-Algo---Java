package Day5hw;

public class frequencydigit {
    // https://www.geeksforgeeks.org/find-the-frequency-of-a-digit-in-a-number/
    public static void main(String args[])
    {
        int number = 346488;
        int target =9;
        int counter=0;
        while(number!=0)
        {
            if(number%10 == target)
              counter = counter+1;
            number = number/10;
        }
        System.out.println(counter);
    }
}
