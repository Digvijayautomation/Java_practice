package Java_practice;
public class Static {

        static int a=5;
        static int b=10;

        public static void addition()
        {
            a=a+b;
            System.out.println("a is" +a);
        }

    public static void main(String[] args) {
        addition();
        a=a*10;
        b++;
        System.out.println("main::Value of a : "+a + " Value of b : "+b);


    }
}
