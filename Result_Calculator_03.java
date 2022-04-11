package Java_practice;

import java.util.Scanner;

public class Result_Calculator_03 {

    public static void main (String args[])
    {


        float total_marks=500;

        System.out.println("Result Calculator For Five Subject");
         Scanner sc=new Scanner(System.in);

        System.out.println("Enter Marks For Marathi");  //Using float because marks can be in float format
        float s1=sc.nextFloat();

        System.out.println("Enter Marks For Hindi");  //Using float because marks can be in float format
        float s2=sc.nextFloat();

        System.out.println("Enter Marks For English");  //Using float because marks can be in float format
        float s3=sc.nextFloat();

        System.out.println("Enter Marks For Geography");  //Using float because marks can be in float format
        float s4=sc.nextFloat();

        System.out.println("Enter Marks For History");  //Using float because marks can be in float format
        float s5=sc.nextFloat();


        float total_obtained_marks=s1+s2+s3+s4+s5;
        System.out.println("Total Marks Obtained By Student Are " +total_obtained_marks);

        float percentage=(total_obtained_marks/total_marks*100);
        System.out.println("Percentage % Is  " +percentage);

    }

}
