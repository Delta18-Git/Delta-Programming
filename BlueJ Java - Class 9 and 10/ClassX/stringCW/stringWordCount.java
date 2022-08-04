package ClassX.stringCW;
import java.util.Scanner;

/**
 * Write a description of class stringEqual here.
 *
 * @author (your name)
 * @version (12/02/2022)
 */
public class stringWordCount
{
    String a;
    Scanner S = new Scanner(System.in);
    void main()
    {
        System.out.println("Enter a sentence.");
        a = S.nextLine();
        int c = 0;
        for(int i = 0; i < a.length(); i++)
        {
            if (a.charAt(i) == ' ')
            {
                c++;            
            }
        }
        c++;
        System.out.println("There are " + c + " words.");
    }
}
