package ClassX.internals110;
import java.util.Scanner;
/**
 * Write a program to check if a number is a Special number or not.
 * 
 * @author (Vinaayak G Dasika) 
 * @version (27/5/2021)
 */
public class specialNumber6
{
    void main()
    {
        int d; //Holds the value of extracted digit.
        int n; //Holds the value of input number.
        int temp; //Holds copy of input number.
        Scanner S = new Scanner(System.in); //Creates a Scanner for input of variables.
        System.out.println("Enter a number to check for Special number.");
        n = S.nextInt(); //Assigns user input integer as input number.
        temp = n; //Creates copy of n in temp.
        int i; //Counter in factorial loop.
        int sum = 0; //Holds sum of factorials of digits of input number.
        while (temp > 0) //Continues loop as long as temp is above zero.
        {
            int fact = 1; //Holds value of factorials and reset to 1 at beginning of each loop.
            d = temp % 10; //Extracts the digit from the number.
            temp = temp/10; //Remove extracted digit from temp.
            for (i = 1; i <= d; i++) //Continues loop from 1 to d, with i getting added by 1.
            {    
                fact = fact * i; //Calculates the factorial.
            }
            sum = sum + fact; //Adds the factorial to sum.
        }
        if (sum == n) //Checks if sum of factorials of digits equals original number.
        {
            System.out.println(n + " is a Special number.");
        }
        else //Condition that number isn't a Special Number.
        {
            System.out.println(n + " is not a Special number.");
        }
    }
}