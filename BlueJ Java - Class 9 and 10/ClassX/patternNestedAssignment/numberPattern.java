package ClassX.patternNestedAssignment;
import java.util.Scanner;
/**
 * A program to print in the sequece of 1*n 2*x 3*x 4*x 5*x.
 *
 * @author (Vinaayak G Dasika)
 * @version (13/04/12021 HE)
 */
public class numberPattern
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for the variable for the number of rows and the multiplier of the sequence.");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= 5; j++)
            {
                int product = i * j;
                System.out.print(product + " ");
            }
            System.out.println();
        }
    }
}
