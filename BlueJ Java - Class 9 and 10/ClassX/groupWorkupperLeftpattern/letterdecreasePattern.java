package ClassX.groupWorkupperLeftpattern;
import java.util.Scanner;
/**
 * Write a description of class starPattern here.
 *
 * @author (Vinaayak G Dasika)
 * @version (29/04/2021)
 */
public class letterdecreasePattern
{
    void main()
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = S.nextInt();
        for(int i = 1; i<=n; i++)
        {
            char x = (char)(i+64);
            for(int j = i; j<=n; j++)
            {
                System.out.print(x);
                x++;
            }
            System.out.println();
        }
    }
}
