package ClassX.stringsInternals;
import java.util.Scanner;

/**
 * Write a program to accept a sentence and count the number of words in it.
 *
 * @author (Vinaayak G Dasika)
 * @version (19/02/2022)
 */
class SentenceWordCount19
{
    Scanner S = new Scanner(System.in);
    void main()
    {
        String input;
        System.out.println("Enter a sentence.");
        input = S.nextLine();
        int words = 0;
        for(int i = 0; i < input.length(); i++)
        {
            if (input.charAt(i) == ' ')
            {
                words++;
            }
        }
        words++;
        System.out.println("There are " + words + " words.");
    }
}