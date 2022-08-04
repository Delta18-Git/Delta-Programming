package ClassX.internals110;
import java.util.Scanner;
/**
 * Write a program to check if a number is a palindrome or not.
 * 
 * @author (Vinaayak G Dasika) 
 * @version (18/3/12021 HE)
 */
class PalindromeNumber4
{
    Scanner S = new Scanner(System.in); //Creates a Scanner for input of variables.
    void main()
    {
        int d; //Holds the value of extracted digit.
        int n; //Holds the value of input number.
        int temp; //Holds copy of input number.
        int r = 0; //Holds reverse of input number.
        System.out.println("Enter a number to check for Palindrome");
        n = S.nextInt(); //Assigns user input integer as input number.
        temp = n; //Creates copy of n in temp.
        while (temp > 0) //Continues loop as long as temp is above zero.
        {
            d = temp % 10; //Extracts the digit from the number.
            r = r * 10 + d; //Adds the extracted digit as the reverse of its original place.
            temp /= 10; //Remove extracted digit from temp.
        }
        if (r == n) //Checks if reversed digit equals original number.
            System.out.println("It is a palindrome: " + n);
        else //Condition that number isn't a palindrome.
            System.out.println("It isn't a palindrome: " + n);
    }
}