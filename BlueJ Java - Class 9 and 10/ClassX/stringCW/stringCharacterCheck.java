package ClassX.stringCW;
import java.util.Scanner;

/**
 * Write a description of class stringEqual here.
 *
 * @author (your name)
 * @version (12/02/2022)
 */
public class stringCharacterCheck
{
    String a;
    char chk;
    Scanner S = new Scanner(System.in);
    void main()
    {
        System.out.println("Enter a word.");
        a = S.nextLine();
        System.out.println("Enter a letter to check for.");
        chk = S.next().charAt(0);
        for(int i = 0; i < a.length(); i++)
        {
            if (a.charAt(i) == chk)
            {
                System.out.println("The letter is in the word at index:" + i);
            }
            // else
            // {
                // System.out.println("The letter isn't in the word at index:" + i);
            // }
        }
    }
}
