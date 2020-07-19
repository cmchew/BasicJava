/*
This application takes 2 integer values and finds the largest one.
Change the application so that it finds the average of two double values.
 */


package BasicJava;

import java.util.Scanner;
public class InputOutput {
    public static void main(String args []){

        Scanner scanner = new Scanner(System.in);

        //Get what we don't know
        System.out.println("First temperature:");
        double num1 = scanner.nextDouble();

        System.out.println("Second temperature:");
        double num2 = scanner.nextDouble();

        //Calculate sum and average
        double sum = num1 + num2;
        double average = sum/2;

        System.out.println("The average is " + average + "." );



    }
}
