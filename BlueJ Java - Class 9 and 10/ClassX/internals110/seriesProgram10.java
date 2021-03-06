package ClassX.internals110;

import java.util.*;
/**
 * Write a program to print series 1, -a^2/3!, -a^3/4!, -a^4/5! ... n terms.
 *
 * @author (Vinaayak G Dasika)
 * @version (27/05/2021)
 */
public class seriesProgram10
{
    void main()
    {
        Scanner S = new Scanner(System.in); //Creates a Scanner for input of variables.
        int n1 = 1; //First number in series.
        double n2; //Second number in series: of format -(a^n1/(n1+1)!)
        int end; //User-input number to run series to. 
        int a; //User-input number to calculate series from.
        int i; //Counter in factorial loop.
        System.out.println("Enter no. of terms to which series should be printed.");
        end = S.nextInt(); //Accepts input for end of series.
        System.out.println("Enter no. for value of a");
        a = S.nextInt(); //Accepts input for a.
        System.out.print(n1); //Prints beginning of series.
        for (n1 = 2; n1 <= end; n1++) //Runs loop until n1 = end, adds n1++ with each end.
        {
            double factorial = 1; //Factorial for series.
            for (i = 1; i <= (n1+1); i++) //Continues loop from 1 to n1+1, with i getting added by 1.
            {    
                factorial = factorial * i; //Calculates the factorial.
            }
            n2 = -1 * (Math.pow(a,n1)/factorial); //Calculates third number.
            System.out.print(", " + n2); //Prints second number.
        }
    }
}
