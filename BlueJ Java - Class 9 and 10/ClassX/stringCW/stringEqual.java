package ClassX.stringCW;
import java.util.Scanner;

/**
 * Write a description of class stringEqual here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class stringEqual
{
    String a;
    String b;
    Scanner S = new Scanner(System.in);
    void main()
    {
        System.out.println("Enter a word.");
        a = S.nextLine();
        System.out.println("Enter a word to check for equality.");
        b = S.nextLine();
        if (a.equals(b))
        {
            System.out.println("The strings are equal.");
        }
        else
        {
            System.out.println("The  strings aren't equal.");
        }
    }
}
