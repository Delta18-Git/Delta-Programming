package ClassX.stringsInternals;

import java.util.Scanner;

/**
 * Write a program to enter a sentence and print the length of the smallest word(s) in that sentence.
 *
 * @author (Vinaayak G Dasika)
 * @version (19/02/2022)
 */
class OriginalSentenceSmallestWord
{
    Scanner in = new Scanner(System.in);
    void main()
    {
        String str, strcopy, word = "", small = "";
        System.out.println("Enter a sentence.");
        str = in.nextLine();
        strcopy = str + " ";
        int len = strcopy.length(), l = 0;
        int min = len;
        char ch = ' ';
        for(int i = 0; i < len; i++)
        {
            ch = strcopy.charAt(i);
            if (strcopy.charAt(i) != ' ')
            {
                word += ch;
            }
            else
            {
                l = word.length();
                if (l < min)
                {
                    min = l;
                    small = word;
                }
                word = "";
            }
        }
        System.out.println("The smallest word is: " + small);
    }
}
