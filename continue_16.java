package Java_practice;

public class continue_16 {

    public static void main(String[] args) {


        System.out.println("Using Continue Statement");
        for (int x = 0; x < 5; x++) {
            System.out.println(x);
            System.out.println("Java Is Great");

            if (x == 2) {
                System.out.println("Java Is Bad"); // it will print 2 statement for x==2 condition and continue the execution
                continue;
            }
        }
    }
}
