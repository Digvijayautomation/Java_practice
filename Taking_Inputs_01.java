package Java_practice;

import java.util.Scanner;

public class Taking_Inputs_01 {

    public static void main (String args[])
    {
        System.out.println("Taking The Input From Keyboard");

        Scanner sc=new Scanner(System.in);  // Scanner is used to getting inputs from Keyboard

       //Adding Integer Numbers
        System.out.println("Enter Number 1 In Integer");
        int num1=sc.nextInt(); // it will store the entered number 1 value in num1
        System.out.println("Enter Number 2 In Integer");
        int num2=sc.nextInt(); // it will store the entered number 2 value in num2

        int int_sum=num1+num2;
        System.out.println("The SUM of Number 1 and Number 2 Is " + int_sum);
        System.out.println("************|Ends Here|**********");


        // Adding float Number
        System.out.println("Enter Number 1 In Float");
        float float1=sc.nextFloat();
        System.out.println("Enter Number 2 In Float");
        float float2=sc.nextFloat();
        float float_sum=float1+float2;
        System.out.println("The SUM of Number 1 and Number 2 Is " + float_sum);
        System.out.println("************|Ends Here|**********");


        // Adding to int with float
        System.out.println("Enter Number 1 In Integer");
        int num_in_int=sc.nextInt();
        System.out.println("Enter Number 2 In Float");
        float num_in_float=sc.nextFloat();
        float int_float_sum=float1+float2;
        System.out.println("The SUM of Number 1 and Number 2 Is " + int_float_sum);
        System.out.println("************|Ends Here|**********");


        // Checking number is Float or not
        System.out.println("To Check Number Is Float Or Not");
        System.out.println("Enter Number");
        boolean b2=sc.hasNextFloat();
         if(b2)
         {
             System.out.println("Number Is Float");
         }


    }
}
