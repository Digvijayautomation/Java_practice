package Java_practice;

public class Methods_practice {

    //Methods for calculating multiplication table
    static void multiplication(int n)
   {
       System.out.println("Multiplication table for\n" +n);
       for (int i=1;i<=10;i++)
       {
           System.out.format(" %d * %d=%d \n",n,i,n*i);
       }
    }

    //Method for Displaying Patterns
    static void  pattern(int n)
    {
            for (int i=0;i<n;i++)
            {
                for(int j=0;j<i+1;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
    }

    // Method for calculating sum of n number

    static int sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n+ sum(n-1);

    }


    public static void main(String[] args) {

         //multiplication(7);
        //pattern(5);

        System.out.println(sum(3));

    }
}
