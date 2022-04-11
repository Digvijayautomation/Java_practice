package Java_practice;

public class if_else_07 {


    public static void main(String[] args) {


        int age=3;


        System.out.println("If else");
        if(age>18)
        {
            System.out.println("Yes, You can Drive");

        }
        else
        {
            System.out.println("NO, You can not Drive"); // Else block is always optional
        }
        System.out.println("************|Ends Here|**********");


        System.out.println("Using Boolean");

        boolean bool=(age>18);

        if(bool)  // if bool is true it will run 1st block
        {
            System.out.println("Yes, You can Drive");

        }
        else
        {
            System.out.println("NO, You can not Drive"); // Else block is always optional
        }
        System.out.println("************|Ends Here|**********");



        System.out.println("Logical AND(&&)");

        boolean a=true;
        boolean b=false;

        if (a && b)
        {
            System.out.println("Only if both are true then the result will be\t" +a);
        }
        else
        {
            System.out.println("If both false or one of them is false then the result will be\t" +b);
        }
        System.out.println("************|Ends Here|**********");



        System.out.println("Logical OR(||)");

        if (a || b)
        {
            System.out.println("If both true or one of them is ture then the result will be\t" +a);

        }
        else
        {
            System.out.println("Only if both are falase then the result will be \t" +b);
        }
        System.out.println("************|Ends Here|**********");



        System.out.println("Logical NOT (!)");

        if (!a)
        {
            System.out.println("It will be display when !b \t" +a);

        }
        else
        {
            System.out.println("It will be display when !a \t" +b);
        }




    }
}
