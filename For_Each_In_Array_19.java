package Java_practice;

public class For_Each_In_Array_19 {
    public static void main(String[] args) {


        System.out.println("Printing Array values in Simple Way ");
        int [] marks = {23,34,56,78,98};

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("************|Ends Here|**********");



        System.out.println("Printing Array values Using For Loop ");

       for(int i=0; i<marks.length;i++)
       {
           System.out.println(marks[i]);
       }
        System.out.println("************|Ends Here|**********");



        System.out.println("Printing Array values In Reverse Way Using For Loop ");

        for(int i=marks.length-1; i>=0;i--)
        {
            System.out.println(marks[i]);
        }
        System.out.println("************|Ends Here|**********");



        System.out.println("Printing Array values Using For Each Loop ");


        for(int element:marks)
            System.out.println(element);

        System.out.println("************|Ends Here|**********");



    }
}
