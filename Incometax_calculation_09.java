package Java_practice;

import java.util.Scanner;

public class Incometax_calculation_09 {

    public static void main(String[] args) {

        //To calculate income tex for slabs as below
        // income 0-2.5 lakh - 0%
        // income 2.5-5 lakh - 10%
        // income 5-10 lakh - 20%
        // income more than 10 lakh - 0%


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Yearly Income In Lakh");
        float income=sc.nextFloat();
        float tax=0;

        if(income <= 2.5) // If income is less than 2.5 lakh tax will be 0
        {
            tax=tax+0;
        }

        else if (income > 2.5f && income >=5.0f) //If income is between 2.5 and 5 lakh then tax will be 10%
        {
            tax=tax+0.05f *(income - 2.5f);
        }

        else if (income > 5.0f && income >=10.0f) //If income is between 5 and 10 lakh then tax will be 20%
        {
            tax=tax+0.05f *(5.0f - 2.5f);
            tax=tax+0.2f *(10.0f- 5.0f);
        }

        else if (income > 10.0f )  //If income is more than 10 lakh then tax will be 30%
        {
            tax = tax + 0.05f *(5.0f - 2.5f);
            tax=tax + 0.2f *(10.0f- 5.0f);
            tax=tax + 0.3f *(income-10.0f);
        }

        System.out.println("Applicable tax for your income is " +tax);
    }
}
