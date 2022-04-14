package Java_practice;

public class VarArgs_25 {

    static  int sum(int ...arr) //this method can accept any number of parameters
    {
        int addition=0;
        for(int a:arr)
        {
            addition +=a;
        }
        return addition;
    }

    static  int multi(int ...arr) //this method can accept any number of parameters
    {
        int multiplication=0;
        for(int m:arr)
        {
            multiplication +=m;
        }
        return multiplication;
    }

    public static void main(String[] args) {

        // Now we can pass same any number of arguments using the method sum

        System.out.println("Addition of 2, 3, 4 Arguments using same methods");
        System.out.println("Addition of 3,7 is \t" + sum(3,7)); //2 Arguments
        System.out.println("Addition of 3,4,9 is \t" + sum(3,4,9)); //3 Arguments
        System.out.println("Addition of 3,4,9,8 is \t" + sum(3,4,9,8)); //4 Arguments


        System.out.println("Multiplication of 2, 3, 4 Arguments using same methods");
        System.out.println("Multiplication of 3,7 is \t" + multi(3,7)); //2 Arguments
        System.out.println("multiplication of 3,4,9 is \t" + multi(3,4,9)); //3 Arguments
        System.out.println("multiplication of 3,4,9,8 is \t" + multi(3,4,9,8)); //4 Arguments





    }
}
