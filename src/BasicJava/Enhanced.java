/*Now you know how to get an input from a user,
modify your "Amending Variable" exercise to ask
for current salary and a number of years.
 */

package BasicJava;

import java.util.Scanner;
public class Enhanced {

    public static void main(String args[]){

        //Initialize known values
        double salGoal;
        double salIncr = .10;

        //Prompt user for salary
        System.out.println("Please enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salStart = scanner.nextInt();

        //Prompt user for number of years
        System.out.println("Please enter the number of years increase:");
        double salYears = scanner.nextDouble();

        //CALCULATE salary increase of ten percent annually after one year
        salGoal = salStart * Math.pow((1.0 + salIncr),salYears);
        System.out.println("Your earnings after " + salYears + "will be $" + salGoal + ".");

    }

}
