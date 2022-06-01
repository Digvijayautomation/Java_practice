package Java_practice;

public class method_overloading_24 {
// SAME NAME BUT DIFFERENT ARGUMENTS
    static void method()
    {
        System.out.println("Hello its method_1 without any Arguments");
    }

    static void method(int a)

    {
        System.out.println("Hello its method_2 with 1 Arguments\t" +a);
    }

    static void method(float a,float c)
    {
        System.out.println("Hello its method_4 with 2 Arguments in Float" +a);
        System.out.println("Hello its method_4 with 2 Arguments in Float" +c);
    }

    public static void main(String[] args) {

       method();
        method(300);
        method(34.45f,56.78f);

    }
}
