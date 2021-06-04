package ClassX.internals110;

import java.util.Scanner;
/**
 * Write a program to print the series.
 * ABCDE
 * ABCD
 * ABC
 * AB
 * A
 *
 * @author (Vinaayak G Dasika)
 * @version (28/05/2021)
 */
public class letterPattern9
{
    void main()
    {
        Scanner S = new Scanner(System.in); //Creates a Scanner for input of variables.
        System.out.println("Enter the number of rows");
        int n = S.nextInt(); //Assigns user input integer as number of rows.
        int i; //Counter for inner loop.
        int j; //Counter for outer loop.
        char x; //Holds output for triangle.
        for (i = n; i >= 1; i--) //Runs loop from number of rows to 1, and creates a new row in the output.
        {
            x = 'A'; //Resets x to A with each new row.
            for (j = 1; j <= i; j++) //Runs loop from j to current value of i, creating the output.
            {
                System.out.print(x); //Prints the current value of x.
                x++; //Adds one to x.
            }
            System.out.println(); //Adds a new line to the output, creating a new row.        
        }
    }
}