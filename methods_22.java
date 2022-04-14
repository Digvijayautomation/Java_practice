package Java_practice;

public class methods_22 {

    static  int Logic_Multiplication(int x, int y)  // method to calculate the multiplication of 2 Interview_Extract_Number_Add_Them
    {
        int z=x*y;
        return z;
    }

    static  int Logic_Dividation(int q, int r)  // method to calculate the Dividation of 2 Interview_Extract_Number_Add_Them
    {
        int p=q*r;
        return p;
    }

    public static void main(String[] args) { // Main Method
         int a=45;
         int b=37;
         int c=0;

         if(a<b)
         {
           c= Logic_Multiplication(a,b); //logic_Multiplication method used here
             System.out.println(c);
         }
         else
         {
             c=Logic_Dividation(a,b); //logic_Dividation method used here
             System.out.println(c);
         }

    }
}
