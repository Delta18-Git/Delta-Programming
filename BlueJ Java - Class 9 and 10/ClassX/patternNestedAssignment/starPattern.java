package ClassX.patternNestedAssignment;
import java.util.Scanner;
/**
 * Write a description of class starPattern here.
 *
 * @author (Vinaayak G Dasika)
 * @version (13/04/12021 HE)
 */
public class starPattern
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows to print.");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j<= 5; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}