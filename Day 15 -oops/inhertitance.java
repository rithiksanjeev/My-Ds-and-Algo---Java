public class inhertitance {
    class a {
        int d=1;
        int d1=10;

        public void fun()
        {
            System.out.println("A fun");
        }
        public void fun1()
        {
            System.out.println("A fun1");
        }
    }

    class b extends a
    {
        int d=2;
        int d2=20;

        public void fun()
        {
            System.out.println("B fun");
        }
        public void fun1()
        {
            System.out.println("B fun1");
        }
    }

    public static void main(String[] args) {
        a obj1 = new a();
        System.out.println(obj1.d);
        System.out.println(obj1.d1);
        obj1.fun();
        obj1.fun1();
        
        a obj2 = new b();
        System.out.println(obj2.d);
        System.out.println(obj2.d1);
        obj2.fun();
        obj2.fun1();
    }
}
