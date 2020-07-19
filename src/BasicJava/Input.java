/*
Complete the following program. Use the Scanner class to read the following string into variables.
Input String: "P Sherman 42 Wallaby Way Sydney" Variables: firstInitial,lastName, houseNumber,streetName,streetType,city

 */

package BasicJava;

import java.util.Scanner;

public class Input {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        //Prompt user for first initial
        System.out.println("Please enter your first initial:");
        String firstInitial = scanner.next();

        //Prompt user for last name
        System.out.println("Please enter your last name:");
        String lastName = scanner.next();

        //Prompt user for house number
        System.out.println("Please enter your house number:");
        String houseNumber = scanner.next();

        //Prompt user for street name
        System.out.println("Please enter your street name:");
        String streetName = scanner.next();

        //Prompt user for street type
        System.out.println("Please enter your street type:");
        String streetType = scanner.next();

        //Prompt user for
        System.out.println("Please enter your city:");
        String city = scanner.next();

        System.out.println(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);


    }


}
