package ClassX.groupWorkupperLeftpattern;
import java.util.Scanner;
/**
 * Write a description of class letterbottomPattern here.
 *
 * @author (Vinaayak G Dasika)
 * @version (29/04/12021)
 */
public class letterbottomPattern
{
    void main()
    {
        char x = 'A';
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed.");
        int n = S.nextInt();
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(x);
            }
            System.out.println();
            x++;
        }
    }
}
