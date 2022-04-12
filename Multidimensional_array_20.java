package Java_practice;

public class Multidimensional_array_20 {

    public static void main(String[] args) {


        System.out.println(" Printing MultiDimensional Array In Simple Way ");

        int [][] Flats=new int[2][3];

        Flats[0][0]=100;
        Flats[0][1]=200;
        Flats[0][2]=300;

        Flats[1][0]=101;
        Flats[1][1]=102;
        Flats[1][2]=103;


        System.out.println(Flats[0][0]);
        System.out.println(Flats[0][1]);
        System.out.println(Flats[0][2]);
        System.out.println(Flats[1][0]);
        System.out.println(Flats[1][1]);
        System.out.println(Flats[1][2]);



        System.out.println("************|Ends Here|**********");

        System.out.println(" Printing MultiDimensional Using FOR lOOP ");

        for(int i=0;i<Flats.length;i++) {
            for (int j = 0; j < Flats[i].length; j++) {
                System.out.print(+Flats[i][j]);
                System.out.println("");
            }
            System.out.println("");

        }
    }
}
