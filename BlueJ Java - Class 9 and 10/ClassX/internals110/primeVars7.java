package ClassX.internals110;

import java.util.*;
/**
 * Write a program to print all prime numbers between two user input numbers.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class primeVars7
{
    void main()
    {
        int low; //Holds the lower limit of prime numbers.
        int high; //Holds the upper limit of prime numbers.
        Scanner S = new Scanner(System.in); //Creates a Scanner for input of variables.
        System.out.println("Enter lower limit of prime numbers.");
        low = S.nextInt(); //Assigns user input integer as lower limit.
        System.out.println("Enter higher limit of prime numbers.");
        high = S.nextInt(); //Assigns user input integer as upper limit.
        int copy = low; //Holds a copy of the lower limit.
        while (copy < high) //Continues loop as long as lower is lesser than ipper limit.
        {
            int flag = 0; //A flag to indicate when a number is prime.
            for (int i = 2; i <= copy/2; i++) //Continues the loop from 2 to low/2, adding 1 to i with each iteration.
            {
                if (copy % i == 0) //Checks if the number is a prime number.
                {
                    flag = 1; //If not prime, sets flag to 1.
                    break; //Ends inner loop.
                }
            }
            if (flag == 0 && copy != 0 && copy != 1) //If prime and not 0 or 1,then prints the number.
                System.out.print(copy + " ");
            copy++; //Adds one to the number.
        }
    }
}