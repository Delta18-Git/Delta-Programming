package ClassX.internals110;

import java.util.*;
/**
 * Write a program to display Floyd’s Triangle.
 *
 * @author (Vinaayak G Dasika)
 * @version (28/05/2021)
 */
public class floydTriangle8
{
    void main()
    {
        Scanner S = new Scanner(System.in); //Creates a Scanner for input of variables.
        int i; //Counter for outer loop.
        int j; //Counter for inner loop.
        int rows; //Holds number of rows to be printed.
        int out = 1; //Holds output for triangle.
        System.out.println("Enter number of rows to print.");
        rows = S.nextInt(); //Assigns user input integer as number of rows.
        for(i = 1; i <= rows; i++) //Runs loop from 1 to number of rows, and creates a new row in the output.
        {
            for(j = 1; j <= i; j++) //Runs loop from j to current value of i, creating the output.
            {
                System.out.print(out + " "); //Prints the current value of out.
                out++; //Adds one to the ouput with each iteration.
            }
            System.out.println(); //Adds a new line to the output, creating a new row.    
        }
    }
}
