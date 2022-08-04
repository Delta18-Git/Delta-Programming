package ClassX.stringsInternals;
import java.util.*;

/**
 * Write a program to accept a sentence and count the number of vowels in it.
 *
 * @author (Vinaayak G Dasika)
 * @version (19/02/2022)
 */
class SentenceVowelsCount18
{
    Scanner S = new Scanner (System.in);
    void main()
    {
        String input;
        int vowel = 0;
        System.out.println("Enter a sentence.");
        input = S.nextLine().toLowerCase();
        for(int i = 0; i < input.length(); i++)
        {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u')
            {
                vowel++;
            }
        }
        System.out.println("There are " + vowel + " vowels.\n");
    }
}