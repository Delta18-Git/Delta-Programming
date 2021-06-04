package ClassX.internals110;

import java.util.*;
/**
 * Write a program to check if a number is a Disarium Number or not. 
 *
 * @author (Vinaayak G Dasika)
 * @version (22/05/2021)
 */
public class disariumNumber2
{
    void main()
    {
        Scanner sc = new Scanner(System.in); //Creates a Scanner for input of variables.
        System.out.println("Enter a number to check for Disarium number.");
        int num = sc.nextInt(); //Accepts next integer as number input.
        int copy = num, d = 0, sum = 0; //copy = copy of input, d = digit, sum = sum of digits to the power of their place value.
        int len = 0; //len = Length of number.
        int safe = copy; //safe = extra copy of number.
        while (safe != 0) //Continues loop until safe = 0.
        {  
            len++; //Adds one to length.
            safe = safe/10; //Removes one digit from safe.
        }  
        while (copy > 0) //Continues loop as long as safe is above 0.
        {
            d = copy % 10; //Extracts the digit from the number input.
            sum = sum + (int)Math.pow(d,len); //Adds d to the power of len to the sum.
            len--; //Subtracts one from the length of the digit.
            copy = copy / 10; //Removes extracted digit from number input.
        }

        if(sum == num) //Checks if number input is equal to the sum of digits to the power of their place value.
            System.out.println(num + " is a Disarium Number."); 
        else //The number input isn't a Disarium number.
             System.out.println(num + " is not a Disarium Number.");
    }
}