/*

Changing Variables

Remember that a variable holds a value and that value can change or vary.
If you use a variable to keep score you would probably increment it
(add one to the current value). You can do this by setting the variable to the
current value of the variable plus one (score = score + 1) as shown below.
Here is an example:

  public static void main(String[] args)
    {
        int score = 0;
        System.out.println(score);
        score = score + 1;
        System.out.println(score);
    }
}


Assignment:

Robert is working on his 5-year goal : To increase his current $62,000 annual income by 10% each year.

Write a pseudocode in a README.md file, first. Then, write an application that will calculate his annual income on the fifth year.
Follow the example from above.
 */


package BasicJava;
import java.util.Scanner;

public class AmendingVariables {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        //Initialize known values
        double salIncr = .10;
        int salYears = 5;
        double salStart = 62000;

        double salYearOne = (salStart * salIncr) + salStart;
        double salYearTwo = (salYearOne * salIncr) + salYearOne;
        double salYearThree = (salYearTwo * salIncr) + salYearTwo;
        double salYearFour = (salYearThree * salIncr) + salYearThree;
        double salYearFive = (salYearFour * salIncr) + salYearFour;

        System.out.println("Robert's starting salary is $" + salStart);
        System.out.println("After five years he will earn $" + salYearFive + ", if he meets his goal.");
    }
}














