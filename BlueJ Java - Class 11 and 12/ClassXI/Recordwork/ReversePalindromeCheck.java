package ClassXI.Recordwork;

import java.util.Scanner;

/**
 * Write a description of class ReversePalindromCheck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReversePalindromeCheck
{
    String str, revStr = "", w = "";
    char c;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        str = sc.nextLine();
        str = str.trim() + " ";
    }
    void reverse()
    {
        for (int i=0; i < str.length(); i++)
        {
            c = str.charAt(i);
            w += c;
            if (c == ' ')
            {
                revStr = w + revStr;
                w = "";
            }
        }
        System.out.println(revStr);
    }
    void palin()
    {
        for (int i = 0; i < revStr.length(); i++){
            String tempW = "";
            c = revStr.charAt(i);
            if (c ==' ')
            {
                for (int j = w.length()-1; j >= 0; j--)
                {
                    tempW += w.charAt(j);
                }
                if (tempW.equalsIgnoreCase(w))
                    System.out.println(w);
                w = "";
                continue;
            }
            w += c;
        }
    }
    public static void main(String[] args) 
    {
        ReversePalindromeCheck obj = new ReversePalindromeCheck();
        obj.input();
        obj.reverse();
        obj.palin();
    }
}
