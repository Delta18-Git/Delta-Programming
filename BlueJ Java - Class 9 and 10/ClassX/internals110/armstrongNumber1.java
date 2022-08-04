package ClassX.internals110;

import java.util.*;
/**
 * Write a program to check if a number is an Armstrong Number or not. 
 *
 * @author (Vinaayak G Dasika)
 * @version (22/05/2021)
 */
class ArmstrongNumber1
{
    Scanner S = new Scanner(System.in); //Creates a Scanner for input of variables.
    int res = 0, digit, num; //res = result of cubing digits, digit = extracted digit, copy = copy of number input.
    void main()
    {
        System.out.println("Enter number to check.");
        num = S.nextInt(); //Accepts next integer as number input.
        int copy = num; //Creates a copy of number input.
        while (copy > 0)
        {
            digit = copy % 10; //Extracts the digit from the number input.
            copy /= 10; //Removes extracted digit from number input.
            res += (digit * digit * digit); //Accumulates cubes of extracted digits.
        }
        if (num == res)
            System.out.println(num +" is an Armstrong number."); //Checks if accumulated cubes match the the number itself.
        else
            System.out.println(num +" is not an Armstrong number."); //The number isn't an armstrong number.
    }
}