package Java_practice;

import java.util.Scanner;

public class switch_conditions_10 {

    public static void main(String[] args) {


        System.out.println("***********************************************");
        System.out.println("Switch Statements");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you Expirience");
        int exp= sc.nextInt();

        switch (exp)
        {
            case 2:
                System.out.println("You are Junior");
                break;

            case 5:
                System.out.println("You are Assistant");
                break;

            case 10:
                System.out.println("You are Senior");
                break;

            default:
                System.out.println("You are not Employed");



        }

    }
}
