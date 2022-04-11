package Java_practice;

public class Examples_04 {

    public static void main(String[] args) {


        //Addition of 3 Numbers

        int num1=45;
        int num2=46;
        int num3=46;

        int sum= num1+num2+num3;
        System.out.println("Addition For Is "+sum);
        System.out.println("************|Ends Here|**********");



        //Calculating CGPA for 3 subject

        float subject1=45;
        float subject2=46;
        float subject3=46;

        float Total_marks= subject1+subject2+subject3;
        System.out.println("Addition For Is 3 Subjects "+Total_marks);

        float CGPA=Total_marks/30;
        System.out.println("CGPA Is "+CGPA);

        System.out.println("************|Ends Here|**********");



        // Kilometer to Miles Conversion //1 kilometer (km) = 0.62137 miles (mi)

        float kilometer= 345;
        float value_of_1_mile=0.622137f;

        float miles=kilometer*value_of_1_mile;

        System.out.println("345 Kilometers in Miles Is " +miles+ "Miles");

    }
}
