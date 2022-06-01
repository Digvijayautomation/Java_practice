package Java_practice;

public class Recurssion_26 {

    //Recursion- Method calling itself
    //E.g- Factorial of n= n * n-1
    //factorial of 5 is 5*4*3*2*1= 120
    //factorial of n = n *factorial(n-1)
    static  int factorial(int n)
    {
        if (n==0  || n==1)
        {
            return  1;
        }
        else
        {
             return  n*factorial(n-1);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Factorial of number 5 is"+factorial(5));
        
    }
}
