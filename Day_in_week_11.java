package Java_practice;

import java.util.Scanner;

public class Day_in_week_11 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Day Number");
        int day=sc.nextInt();


        switch (day){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");

                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("This is not an day in week");
                break;


        }


    }
}
