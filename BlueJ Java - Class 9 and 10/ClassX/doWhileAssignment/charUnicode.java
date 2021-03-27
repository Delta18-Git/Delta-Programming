package ClassX.doWhileAssignment;
import java.util.Scanner;
/**
 *  Write a program to accept alphabets and display its Unicode value. 
 *  The program should terminate when a vowel is entered.
 *
 * @author (Vinaayak G Dasika)
 * @version (27/03/12021 HE)
 */
public class charUnicode
{
    char input;
    int output, flag = 0;
    Scanner Systemin = new Scanner(System.in);
    void main()
    {
        do
        {
            System.out.println("Enter an alphabet.");
            input = Systemin.next().charAt(0);
            switch(input)
            {
                case 'a': case 'A': case 'e': case 'E': case 'i': case 'I':
                case 'O': case 'o': case 'u': case 'U': flag = 1; break;
                default: flag = 0;
            }
            output = (int)input;
            System.out.println("Unicode value is "+output);
        }while(flag == 0);
    }
}