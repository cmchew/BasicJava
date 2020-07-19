package BasicJava;

import java.util.Scanner;

public class Rainfall {
    public static void main(String[] args) {

            //Initialize known values
            double gallon = 231;

            Scanner scanner = new Scanner(System.in);

            //Prompt user to enter roof dimensions
            System.out.println("Please enter the roof length in inches:");
            int length = scanner.nextInt();
            System.out.println("Please enter the roof width in inches:");
            int width = scanner.nextInt();
            System.out.println("Please enter the rainfall in inches:");
            double rainfall = scanner.nextDouble();

            //Multiply roof dimensions by number of inches of rainfall

            double water = length * width * rainfall;

            double runoff = water/gallon;

            //Display runoff
            System.out.println("During a rainstorm " + runoff + " gallons of water runs off my roof for every " + rainfall + " inches of rainfall.");



        }
    }


