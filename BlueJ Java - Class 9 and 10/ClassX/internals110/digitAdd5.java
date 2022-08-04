package ClassX.internals110;
import java.util.Scanner;
/**
 * Write a program to find the sum of digits in a number. 
 * 
 * @author (Vinaayak G Dasika) 
 * @version (27/5/2021)
 */
class DigitAdd5
{
    Scanner S = new Scanner(System.in); //Creates a Scanner for input of variables.
    void main()
    {
        int d; //Holds the value of extracted digit.
        int n; //Holds the value of input number.
        int temp; //Holds copy of input number.
        int sum = 0; //Holds sum of digits of input number.
        System.out.println("Enter number whose digits to be added.");
        n = S.nextInt(); //Assigns user input integer as input number.
        temp = n; //Creates copy of n in temp.
        while (temp > 0) //Continues loop as long as temp is above zero.
        {
            d = temp % 10; //Extracts the digit from the number.
            sum += d; //Adds the extracted digit as the reverse of its original place.
            temp /= 10; //Remove extracted digit from temp.
        }
        System.out.println("Sum of digits of " + n + " is " + sum); 
    }
}
