package ClassX.internals110;

import java.util.*;
/**
 * Write a program to print the fibonacci series upto a number.
 *
 * @author (Vinaayak G Dasika)
 * @version (27/05/2021)
 */
public class fibonacciSeries3
{
    void main()
    {
        Scanner S = new Scanner(System.in); //Creates a Scanner for input of variables.
        int n1 = 0; //First number in series.
        int n2 = 1; //Second number in series.
        int n3; //Third number in series: Sum of previous two numbers
        int end; //User-input number to run series to.
        System.out.println("Enter no. to which series to be printed.");
        end = S.nextInt(); //Accepts input for end of series.
        System.out.print(n1 + ", " + n2); //Prints beginning of series.
        while ((n1 + n2) <= end) //Runs loop until n3 = end.
        {
            n3 = n1 + n2; //Calculates third number.
            System.out.print(", " + n3); //Prints third number.
            n1 = n2; //Shifts number 1 to number 2.
            n2 = n3; //Shifts number 2 to number 3.
        }
    }
}