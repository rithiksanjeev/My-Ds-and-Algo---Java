public class stringpg {
    public static void main(String[] args){
        //String is a collection of characters placed btw " "
        // https://www.w3schools.com/java/java_ref_string.asp

        String str ="Hai iam rithik 12345 *() ";

        // some functions of strings
        // we can find the length of the string

        int len = str.length(); // () = for string class


        // indexing of charcaters int string starts from 0 like arrays
        // we can access the characters of the string
        
        char ch = str.charAt(0);

        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i)+" ");
        }

        // substring

        String sb = str.substring(2, 5); // chat at st idx will be counted but the char at ending isx will not be counted
        // 2,3,4 will be printed

        String sb2 = str.substring(2);// it will print from idx till the end

        // case conversion

        // string upper cases

        String st2 = str.toUpperCase(); 

        // string lowercase

        String st3 = str.toLowerCase(); 

        String st4 = str.trim(); // remove initial and trailing spaces

    }
}
