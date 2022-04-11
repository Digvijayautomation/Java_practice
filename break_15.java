package Java_practice;

public class break_15 {

    public static void main(String[] args) {

        System.out.println("Using Break Statement");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("Java Is Great");

            if (i == 2) {
                System.out.println("Java Is Bad"); // it will print 2 statement for x==2 condition and break the execution
                break;
            }



            }

        }
    }
