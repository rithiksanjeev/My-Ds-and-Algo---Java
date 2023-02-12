package Day14;

public class oops {

    // defining the structure of student class [blueprint] 
    // writing our own data structure we need a class
    static class student {
        
        String CollegeName;
        String name;
        int roll_num;
        String fathername;
        boolean gender; // true -> male || false -> female
        String Department;
        student(){}; //default constructor

        // student(String colnm,String nm,int rll,String fn,boolean mf,String dept) // paramatrised construtor
        // {
        //     CollegeName = colnm;
        //     name = nm;
        //     roll_num = rll;
        //     fathername = fn;
        //     gender = mf;
        //     Department =dept;
        // }

        student(String CollegeName,String name,int roll_num,String fathername,boolean gender,String Department) // paramatrised construtor
        {
    
            this.CollegeName = CollegeName; // this.xyz = instance.xyz
            this.name = name;
            this.roll_num = roll_num;
            this.fathername = fathername;
            this.gender = gender;
            this.Department =Department;
        }

        public void displaydetails()
        {
            System.out.println(this.CollegeName);
            System.out.println(this.name);
            System.out.println(this.roll_num);
            System.out.println(this.fathername);
            System.out.println(this.gender);
            System.out.println(this.Department);
        }
    }
    

    public static void main(String[] args)
    {
        
        //creating the object [constructing based on blueprint]
        //datatype variable(reference)   = value(instance);
        //int       i                    =  10; (created a object) //usual way
        student     s1                    = new student(); // s1 is poinitng to the new instance(Address)
        student s2 = new student(); //s3 is poinitng to the new instance(Address)
        student s3 = s2; // s3 points to the reference of old instance (s2)
        //s1,s2,s3, are references +s1 -> objects
        System.out.println("s1 -> "+ s1);
        System.out.println("s2 -> "+ s2); 
        System.out.println("s3 -> "+ s3); //same address as s3
        // referneces -> instances
        // s1         -> Day14.oops$student@5204062d
        // s2         -> Day14.oops$student@4fcd19b3
        // s3         -> Day14.oops$student@4fcd19b3

        //instance and reference are two diffrent things
        //using s1 refernce went to the instance/object and created the value (Assinging)
        s1.CollegeName="skcet";
        s1.name ="Rithik";
        s1.roll_num = 110;
        s1.fathername = "kumar";
        s1.gender = true;
        s1.Department = "IT";

        //Reading the values that are stored
        // System.out.println(s1.CollegeName);
        // System.out.println(s1.name);
        // System.out.println(s1.roll_num);
        // System.out.println(s1.fathername);
        // System.out.println(s1.gender);
        // System.out.println(s1.Department);

        //when there are 1000 values assume how the above code would look like then we can go for usage for constructor when many values can be passed 
        //constructor
        student s4 = new student("skceet", "ro", 111, "rohifa", false, "It");
        //s4.displaydetails();

        //this keyword
        // student s5 = new student("xyz", null, 0, null, false, null);
        // s5.displaydetails();

        student s6 = new student("xyzcol", "asd", 0,"kumar", false, "hr");
        //s6.displaydetails();
        swap(s4,s6); //s4 and s6 both are addresses
        System.out.println("s4 details");
        s4.displaydetails();
        System.out.println("s6 details");
        s6.displaydetails();

        
    }

    //swapping cannot be done in function (java is call by value) rooms eg when we directly try swapping it swaps only the addresses not its values
    static void swap(student s4,student s6)
    {
        // only when we do (instance.value) the value gets changed so java is call by value
        String temp = s4.CollegeName;
        s4.CollegeName = s6.CollegeName;
        s6.CollegeName = temp;
        // here the changes are locally only done within this function
        // student temp = s4;
        // s4=s6;
        // s6=temp;
    }

}
