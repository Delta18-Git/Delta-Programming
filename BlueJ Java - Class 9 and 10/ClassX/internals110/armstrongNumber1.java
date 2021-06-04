package ClassX.internals110;

import java.util.*;
/**
 * Write a program to check if a number is an Armstrong Number or not. 
 *
 * @author (Vinaayak G Dasika)
 * @version (22/05/2021)
 */
public class armstrongNumber1
{
    void main()
    {
        System.out.println("Enter the no. to check for Armstrong Number.");
        Scanner S = new Scanner(System.in); //Creates a Scanner for input of variables.
        int res = 0, digit, no; //res = result of cubing digits, digit = extracted digit, no = copy of number input.
        int num = S.nextInt(); //Accepts next integer as number input.
        no = num; //Creates a copy of number input.
        while (num > 0)
        {
            digit = num % 10; //Extracts the digit from the number input.
            num = num / 10; //Removes extracted digit from number input.
            res = res + (digit * digit * digit); //Accumulates cubes of extracted digits.
        }
        if (no == res)
            System.out.println(no +" is an Armstrong number."); //Checks if accumulated cubes match the the number itself.
        else
            System.out.println(no +" is not an Armstrong number."); //The number isn't an armstrong number.
    }
}