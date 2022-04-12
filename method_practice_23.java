package Java_practice;

public class method_practice_23 {

    static  void change_integer(int x)
    {
        x=78;
    }

    static  void change_array(int [] arr)
    {
       arr [0]=80;
    }




    public static void main(String[] args) {

        //Will check after using the method original value of variable will change or not in Array
        int a=45;
        change_integer(a); // change_integer method used
        System.out.println("Value of integer will not change it will be same " +a);

        System.out.println("************|Ends Here|**********");

        //Will check after using the method original value of variable will change or not in Array

        int[] marks={34,34,56,56,43,45};
        change_array(marks);

        System.out.println("Value of Array will change as the array passes the references  " +marks[0]);







    }
}
