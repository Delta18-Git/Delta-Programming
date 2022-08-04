package ClassX.internals110;

import java.util.*;
/**
 * Write a program to check if a number is a Disarium Number or not. 
 *
 * @author (Vinaayak G Dasika)
 * @version (22/05/2021)
 */
class DisariumNumber2
{
    void main()
    {
        Scanner S = new Scanner(System.in); //Creates a Scanner for input of variables.
        int num, d = 0, sum = 0, len = 0; //copy = copy of input, d = digit, sum = sum of digits to the power of their place value, len = Length of number.  
        System.out.println("Enter number to check.");
        num = S.nextInt(); //Accepts next integer as number input.
        int copy = num;
        int safe = copy; //safe = extra copy of number.
        while (safe != 0) //Continues loop until safe = 0.
        {  
            len++; //Adds one to length.
            safe /= 10; //Removes one digit from safe.
        }  
        while (copy > 0) //Continues loop as long as safe is above 0.
        {
            d = copy % 10; //Extracts the digit from the number input.
            sum += (int)Math.pow(d,len); //Adds d to the power of len to the sum.
            len--; //Subtracts one from the length of the digit.
            copy /= 10; //Removes extracted digit from number input.
        }

        if(sum == num) //Checks if number input is equal to the sum of digits to the power of their place value.
            System.out.println("It is a Disarium Number: " + num); 
        else //The number input isn't a Disarium number.
            System.out.println("It isn't a Disarium Number: " + num);
    }
}