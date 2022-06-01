package Java_practice;

public class Array_18 {
    public static void main(String[] args) {

        // There are main 3 ways to Create and array

        //1. Declaration and memory allocation together and then initialization ;

            //Declaration and memory allocation
           int[] marks=new int[5];

           //initialization
           marks[0]=34;
           marks[1]=35;
           marks[2]=56;
           marks[3]=90;
           marks[4]=67;

        System.out.println("Marks at 4th position is In Array \t"+marks[4]);
        System.out.println("************|Ends Here|**********");

        //2. Declaration and Then memory allocation and then initialization ;

        //Declaration and
        int[] marks1;

        //memory allocation
        marks1=new int[5];

        //initialization
        marks1[0]=34;
        marks1[1]=35;
        marks1[2]=56;
        marks1[3]=90;
        marks1[4]=67;

        System.out.println("Marks at 3rd position is In Array \t"+marks[3]);
        System.out.println("************|Ends Here|**********");


        //3 Declaration, memory allocation , initialization, Everything all together


        int [] marks2 = {23,34,56,78,98};
        System.out.println("Marks at 2nd position is In Array \t"+marks2[2]);

    }
}
