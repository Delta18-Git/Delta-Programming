package ClassX.stringsInternals;

import java.util.Scanner;

/**
 * Write a program to enter a sentence and print the length of the smallest word(s) in that sentence.
 *
 * @author (Vinaayak G Dasika & Teacher)
 * @version (20/02/2022)
 */
class SentenceSmallestWord20
{
    Scanner S = new Scanner(System.in);
    String str, small;
    void main()
    {
        System.out.println("Enter a sentence.");
        str = S.nextLine();
        int b = 0; 
        String w;
        str = str.trim() + " ";
        small = str.substring(0,str.indexOf(' '));
        for (int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == ' ')
            {
                w = str.substring(b,i);
                b = i+1;
                if(w.length() < small.length())
                {
                    small = w;
                }
            }
        }   
        System.out.println("Length of smallest word is: "+ small.length());
    }
}