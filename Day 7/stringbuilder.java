public class stringbuilder {
    public static void main(String args[])
    {
        StringBuilder sb = new StringBuilder(); // This creates a stringbuilder with inititial capacity of 16 characters
        StringBuilder sb2 = new StringBuilder("Rithik");

        // length of the string builder
        int len = sb.length();
        //  Reading the character of string builderz
        char ch = sb.charAt(0);

        // read character by character
        for(int i=0;i<sb.length();i++)
        {
            System.out.println(sb.charAt(i));
        }

        // set a charcater -> override
        sb.setCharAt(3, 'b');
        //delete a charcter in any index
        sb.deleteCharAt(5);
        // convert a string builder to a string
        sb.toString();

    }
}
