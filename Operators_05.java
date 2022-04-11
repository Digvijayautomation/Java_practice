package Java_practice;

public class Operators_05 {


    public static void main (String args[]) {

        System.out.println("************************************************");

        float a=12; // Reasons for using float is "we never know when decimal value will occur"
        float b=34;
        System.out.println("a=" +a);
        System.out.println("b=" +b);

        System.out.println("************************************************");

        System.out.println("Airthematic Operators");
        float sum=a+b;
        float substraction=a-b;
        float multiplication=a*b;
        float dividation=a/b;
        float percentage=a%b;

        System.out.println("addition of " +a+ " and " +b+ " is " +sum);
        System.out.println("substraction of " +a+ " and " +b+ " is " +substraction);
        System.out.println("multiplication of " +a+ " and " +b+ " is " +multiplication);
        System.out.println("dividation of " +a+ " and " +b+ " is " +dividation);
        System.out.println("percentage of " +a+ " and " +b+ " is " +percentage);

        System.out.println("************************************************");




        System.out.println("Assignment Operators");
        float  a1= a-= b ;
        float  a2= a += b ;
        float  a3= a *= b ;
        float  a4= b /= b ;

        System.out.println("a-= b is "+a1);
        System.out.println("a += b is "+a2);
        System.out.println("a *= b is "+a3);
        System.out.println("b /= b is "+a4);
        System.out.println("************************************************");


        System.out.println("Comparison Operators");
          boolean c1 = a==b;
          boolean c2 = a!=b;
          boolean c3 = a<b;
          boolean c4 = a>b;

        System.out.println("a==b is " +c1);
        System.out.println("a!=b is " +c2);
        System.out.println("a<b is " +c3);
        System.out.println("a>b is " +c4);

        System.out.println("************************************************");

        System.out.println("Logical Operators");
        boolean l1 = a==b && a!=b;   // if one the true and one is false it will consider as false
        boolean l2 = a<b || a>b;    // if one the true and one is false it will consider as true


        System.out.println("a==b && a!=b is " +l1);
        System.out.println("a<b || a>b is " +l2);



        System.out.println("************************************************");


        System.out.println("Precedence of Associativity between Operators");

        int x1= 40 * 50 / 10;
        int x2= 100 / 20 * 10;

        System.out.println("40 * 8 / 47 is " +x1);
        System.out.println("40 / 20 * 10 is " +x2);

        System.out.println("************************************************");


        System.out.println("Increment and decrement Operators");

        int x= 50;
        System.out.println("Value of x Is " +x);

        int y=x++; // It stores the value of x into y and then increment it
        System.out.println("Value of y=x++ Is " +y+ " And x is now " +x);

         int z=++x;
        System.out.println("Value of z=++x; Is " +z+ " And x is now " +x);

        int w=--x;

        System.out.println("Value of w=--x; Is " +w+ " And x is now " +x);



        System.out.println("************************************************");
    }

}
