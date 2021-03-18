package ClassX;
import java.util.Scanner;
/**
 * A class to reverse and print a digit.
 * 
 * @author (Vinaayak G Dasika) 
 * @version (18/03/12021 HE)
 */
public class digitReverser
{
    int d, n, r = 0;
    Scanner S = new Scanner(System.in);
    void main()
    {
        System.out.println("Enter a number to reverse");
        n = S.nextInt();
        while (n > 0)
        {
            d = n % 10;
            r = r * 10 + d;
            n = n/10;
        }
        System.out.println("Reversed number = " + r);
    }
}
