package ClassX.methodsAssignments;

import java.util.*;
/**
 * Write a program to accept a number and print if it is a palindorme or not.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class palindrome
{
    Scanner S = new Scanner(System.in);
    int x,temp = x,d;
    void accept()
    {
        System.out.println("Enter a number to check for Palindrome");
        x = S.nextInt();
    }
    int palin()
    {
        int r = 0;
        while (temp > 0)
        {
            d = temp % 10;
            r = r * 10 + d;
            temp = temp/10;
        }
        return r;
    }
    void main()
    {
        accept();
        int rev = palin();
        if (rev == x)
        {
            System.out.println(x + " is a palindrome.");
        }
        else 
        {
            System.out.println(x + " is not a palindrome.");
        }
    }
}