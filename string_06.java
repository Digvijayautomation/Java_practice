package Java_practice;

import java.util.Locale;
import java.util.Scanner;

public class string_06 {

    public static void main(String[] args) {

        String str=new String("Vijaywada");
        System.out.println("Given String is " +str);

        System.out.println("Substring 4 Is");
        String substring= str.substring(0,4);
        System.out.println(substring);
        System.out.println("************|Ends Here|**********");

        System.out.println("Replacing a with x");
        String replace=str.replace("a","x");
        System.out.println(replace);
        System.out.println("************|Ends Here|**********");

        System.out.println("Checking if string staring with v");
        boolean Startwith=str.startsWith("V");
        System.out.println(Startwith);
        System.out.println("************|Ends Here|**********");

        System.out.println("Checking if string End with a");
        boolean Endwith=str.endsWith("a");
        System.out.println(Endwith);
        System.out.println("************|Ends Here|**********");

        System.out.println("Checking character at index 2");
        char char_index=str.charAt(2);
        System.out.println(char_index);
        System.out.println("************|Ends Here|**********");

        System.out.println("Checking index of given character y");
        int index=str.indexOf("a");
        System.out.println(index);
        System.out.println("************|Ends Here|**********");

        System.out.println("Checking string is matching");
        boolean equal=str.equals("Vijaywada");
        System.out.println(equal);
        System.out.println("************|Ends Here|**********");

        System.out.println("Checking string is matching");
        boolean equal_without_case=str.equalsIgnoreCase("vijaywada");
        System.out.println(equal_without_case);
        System.out.println("************|Ends Here|**********");

        String Lowercase= str.toLowerCase();
        System.out.println("String Into Lowercase is " +Lowercase);
        String Uppercase= str.toUpperCase();
        System.out.println("String Into Uppercase is " +Uppercase);
        System.out.println("************|Ends Here|**********");


        //int a=6;
       // float b=7575.858f;
       // System.out.printf("The value of a is %d and value of b is %f",a,b);

      //  Scanner sc=new Scanner(System.in);

      //  System.out.println("Enter String");
        // entered_string =sc.next(); // Only print values till space occur
//
         //String entered_string_full=sc.nextLine(); // Prints all the value
        //System.out.println("Output for sc.nextline "+entered_string_full);



        System.out.println("ESC Sequence character");

        String Letter= "Im Learning Java From Basic";
        String Letter1= "Im Learning\n Java From Basic"; // \n for next line
        String Letter2= "Im Learning\t Java From Basic"; // \t for tab
        String Letter3= "\"Im Learning Java From Basic\"";

        System.out.println(Letter);
        System.out.println(Letter1);
        System.out.println(Letter2);
        System.out.println(Letter3);


        System.out.println("************|Ends Here|**********");









    }
}
