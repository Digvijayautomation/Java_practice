package Java_practice;

public class loops_practice_17 {

    public static void main(String[] args) {

        System.out.println("Printing Stars From 1 to 10");

        for(int i=1; i<=10; i++)  // for incrementing the value of i
        {
            for (int j=0; j<i; j++) // for printing the value i in the form of *
            {
                System.out.print("*");
            }
                System.out.print("\n");

        }

        System.out.println("************|Ends Here|**********");

        System.out.println("Addition of 1st 5 EVEN Numbers");
        int sum_even=0;
        for(int i=0; i<5;i++)
        {
            sum_even = sum_even+(2*i);

        }
        System.out.println(sum_even);
        System.out.println("************|Ends Here|**********");




        System.out.println("Addition of 1st 5 ODD Numbers");
        int sum_odd=0;
        for(int i=0; i<5;i++)
        {
            sum_odd = sum_odd+(2*i+1); //for odd number 2n+1

        }
        System.out.println(sum_odd);
        System.out.println("************|Ends Here|**********");




        System.out.println("Multiplication Table of 5");
            int n=5;

        for (int i=1;i<=10;i++)
        {
            System.out.printf("%d * %d=%d \n",n,i,n*i);  // printf method is used
        }
        System.out.println("************|Ends Here|**********");


        System.out.println("Multiplication Table of 10 in Reverse order");
        int x=10;

        for (int i=10;i>0;i--)
        {
            System.out.printf("%d * %d=%d \n",x,i,x*i);  // printf method is used for proper formatting
        }


        System.out.println("************|Ends Here|**********");


        System.out.println("Factorial of number 10"); // Factorial of number 10! = 10*9*8*7*6*5*4*3*2*1
        int number=10;
        int factorial=1;
        int i=1;

        while (i<number)
        {
            factorial *= i;
            i++;

            System.out.printf("%d * %d=%d \n", factorial, i,factorial*i);
        }
        System.out.println("************|Ends Here|**********");



    }
}
