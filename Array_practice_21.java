package Java_practice;

import java.util.Scanner;

public class Array_practice_21 {

    public static void main(String[] args) {

        // Practice program 1

        System.out.println(" Adding 5 float values in array ");
        float [] degree={23.34f,56.34f,56.57f,67.4f,54.6f};
        float sum = 0;
        for(float element:degree)
        {
           sum = sum + element;
        }
        System.out.println("Sum is"+sum);

        System.out.println("************|Ends Here|**********");

        // Practice program 3

        System.out.println(" Calculating the average of marks for 10 student");
        int [] total_marks={23,34,3,33,45,56,57,68,67,87};
        int sum_of_10 = 0;
        int average=0;
        for(int element:total_marks)
        {
            sum_of_10 = sum_of_10 + element;

            average=sum_of_10/10;
        }
        System.out.println("Sum is \t"+sum_of_10);
        System.out.println("Average is \t"+average);
        System.out.println("************|Ends Here|**********");





        //Program 4
        System.out.println(" Adding two matrix");

        int [][] matrix1={ {1, 2, 3},
                          {4, 5, 7}
                         };

        int [][] matrix2={ {2, 9, 3},
                           {6, 5, 8}
                          };

        int [][] Result={ {0,0,0},
                           {0,0,0}
                         };

        for(int i=0;i<matrix1.length;i++)
        {
            for (int j=0;j<matrix1[i].length;j++)
            {
                System.out.printf("Setting value for i=%d, j=%d\n",i ,j);
                Result[i][j]= matrix1[i][j] + matrix2[i][j];
            }
        }

        for(int i=0;i<matrix1.length;i++)
        {
            for (int j=0;j<matrix1[i].length;j++)
            {
                System.out.print(Result[i][j] + " ");
                Result[i][j]= matrix1[i][j] + matrix2[i][j];
            }
            System.out.println("");
        }

        System.out.println("************|Ends Here|**********");





    }
    }

