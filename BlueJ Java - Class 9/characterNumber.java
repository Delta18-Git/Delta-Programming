import java.io.*;
import java.util.*;
/**
 * Write a description of class weirdQuestion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class characterNumber
{
    int n;
    char c;
    void main()
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter a number to advance a character");
        n = S.nextInt();
        System.out.println("Enter a character"); 
        c = S.next().charAt(0);
        char ans = (char)(c + n);
        System.out.println("The result is = "+ans);
    }
}
