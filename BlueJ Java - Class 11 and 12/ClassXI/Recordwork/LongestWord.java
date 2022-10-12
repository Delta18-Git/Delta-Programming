package ClassXI.Recordwork;
import java.util.Scanner;

/**
 * 
 * 
 *
 * @author (Vinaayak G Dasika)
 * @version (06/08/2022)
 */
class LongestWord
{
    String str,large;
    void input()
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter a sentence.");
        str = S.nextLine();
    }
    void check()
    {
        int b = 0; 
        String w;
        str = str.trim() + " ";
        large = str.substring(0,str.indexOf(' '));
        for (int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == ' ')
            {
                w = str.substring(b,i);
                b = i+1;
                if(w.length() > large.length())
                {
                    large = w;
                }
            }
        }   
        System.out.println("The largest word is: "+ large);
    }
    public static void main(String[] args)
    {
        LongestWord obj = new LongestWord();
        obj.input();
        obj.check();
    }
}