package Java_practice;

import java.util.Scanner;

public class else_if_08 {

    public static void main(String[] args) {


      Scanner sc=new Scanner(System.in);
        System.out.println("Enter you Expirience");
          int exp= sc.nextInt();


        if(exp>8)
        {
            System.out.println("You are Senior");
        }
        else if(exp>4)
        {
            System.out.println("You are Assistant");
        }
        else if(exp>2)
        {
            System.out.println("You are Junior");
        }
        else
        {
            System.out.println("You are Fresher");
        }



    }
}
