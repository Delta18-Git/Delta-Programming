package ClassX;
import java.util.*;

/**
 * Enter n characters, then count no. of upper and lower case characters.
 *
 * @author (Vinaayak G Dasika)
 * @version (02/09/2021)
 */
public class caseCounter
{
    char character;
    int upper = 0, lower = 0, number;
    Scanner S = new Scanner(System.in);
    void main()
    {
        System.out.println("Enter number of characters");
        number = S.nextInt();
        for(int i = 1; i <= number; i++)
        {
            System.out.println("Enter one character");
            character = S.next().charAt(0);
            if(Character.isUpperCase(character))
            {
                upper++;
            }
            else if(Character.isLowerCase(character))
            {
                lower++;
            }
        }
        System.out.println("Uppercase characters = "+upper);
        System.out.println("Lowercase characters = "+lower);
    }
}
