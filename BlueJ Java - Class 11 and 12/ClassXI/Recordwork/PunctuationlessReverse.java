package ClassXI.Recordwork;
import java.util.Scanner;


/**
 * Write a description of class PunctuationlessReverse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PunctuationlessReverse
{
    String str, rev = "";
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence");
        str = sc.nextLine();
        str = str.trim() + " ";
    }
    void reverse()
    {
        String w = "";
        for (int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            if(Character.isLetter(c) || Character.isDigit(c) || c == ' ')
            {
                w += c;
                if(c == ' ')
                {
                    rev = w + rev;
                    w = "";
                }
            }
        }
    }
    void output()
    {
        System.out.print("The reversed sentence is: ");
        System.out.println(rev);
    }
    public static void main(String[] args) {
        PunctuationlessReverse obj = new PunctuationlessReverse();
        obj.input();
        obj.reverse();
        obj.output();
    }
}
