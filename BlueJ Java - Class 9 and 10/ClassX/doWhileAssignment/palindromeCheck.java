package ClassX.doWhileAssignment;
import java.util.Scanner;
/**
 * A class to check if a number is a palindrome.
 * 
 * @author (Vinaayak G Dasika) 
 * @version (27/3/12021 HE)
 */
public class palindromeCheck
{
    int d, n, temp, r = 0;
    Scanner S = new Scanner(System.in);
    void main()
    {
        System.out.println("Enter a number to check for Palindrome");
        n = S.nextInt();
        temp = n;
        do
        {
            d = temp % 10;
            r = r * 10 + d;
            temp = temp/10;
        }while (temp > 0);
        if (r == n)
        {
            System.out.println(n + " is a palindrome");
        }
        else
        {
            System.out.println(n + " is not a palindrome");
        }
    }
}