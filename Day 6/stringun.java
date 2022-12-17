public class stringun {
    public static void main(String args[])
    {
        String str1 = "Rithik";
        String str2 = "Rithik";
        String str3 = new String("Rithik"); // str1 != str3 (compares memory address stores in stack) when str1 == str3 is done
        // string pool ->  special area for strings in string pool
        // System.out.println(str1.hashCode());
        // System.out.println(str2.hashCode());
        // System.out.println(str3.hashCode());
        System.out.println( System.identityHashCode(str1));
        System.out.println( System.identityHashCode(str2));
        System.out.println( System.identityHashCode(str3));

        // in strings there is another comparision  .equals() -> it compared word by word

        if(str1.equals(str3)){ // when used str1 == str3 it compared stack memory so always will print diffrent
            System.out.println("same");
        }
        else{
            System.out.println("diffrent");
        }
    }
}
