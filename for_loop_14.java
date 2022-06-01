package Java_practice;

public class for_loop_14 {

    public static void main(String[] args) {

        // Incrementing For Loop
        System.out.println("To print 1 TO 10 Numbers");
        for(int i=1;i<=10;i++)   //(Initialize--Check Condition--update)
        {
            System.out.println(i);
        }
        System.out.println("************|Ends Here|**********");


        // Decrementing  For Loop
        System.out.println("To print 10 TO 1 Numbers");
        for(int i=10;i>0;i--)   //(Initialize--Check Condition--update)
        {
            System.out.println(i);
        }
        System.out.println("************|Ends Here|**********");

        System.out.println("To print 1st 10 Even Number Numbers");


        for(int i=0;i<=10;i++)
        {
            System.out.println(2*i);  // For Even Number you have to use formula- 2n
        }
        System.out.println("************|Ends Here|**********");

        System.out.println("To print 1st 10 ODD Number Numbers");

        for(int i=0;i<=10;i++)
        {
            System.out.println(2*i+1);  // For Even Number you have to use formula- 2n+1
        }
    }
}
