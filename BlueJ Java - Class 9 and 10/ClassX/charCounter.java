package ClassX;
import java.util.*;

/**
 * Write a program to count the type of characters in n number of characters.
 *
 * @author (Vinaayak G Dasika)
 * @version (02/09/2021)
 */
public class charCounter
{
    char character;
    int letter = 0, number = 0, special = 0, numberc;
    Scanner S = new Scanner(System.in);
    void main()
    {
        System.out.println("Enter number of characters");
        numberc = S.nextInt();
        for(int i = 1; i <= numberc; i++)
        {
            System.out.println("Enter one character");
            character = S.next().charAt(0);
            if(Character.isLetter(character))
            {
                letter++;
            }
            else if(Character.isDigit(character))
            {
                number++;
            }
            else
            {
                special++;
            }
        }
        System.out.println("Alphabet characters = "+letter);
        System.out.println("Number characters = "+number);
        System.out.println("Special characters = "+special);
    }
}
