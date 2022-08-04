package ClassX.stringCW;
import java.util.Scanner;

/**
 * Write a description of class stringLengthEqual here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class stringLengthEqual
{
    String a;
    String b;
    Scanner S = new Scanner(System.in);
    void main()
    {
        System.out.println("Enter a word.");
        a = S.nextLine();
        System.out.println("Enter a word to check for length equality.");
        b = S.nextLine();
        if (a.length() == b.length())
        {
            System.out.println("The lengths of the strings are equal.");
        }
        else
        {
            System.out.println("The lengths of the strings aren't equal.");
        }
    }
}