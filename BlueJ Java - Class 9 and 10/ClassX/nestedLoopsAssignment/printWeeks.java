package ClassX.nestedLoopsAssignment;
import java.util.Scanner;

/**
 * A program to print the days sequentially in n weeks.
 *
 * @author (Vinaayak G Dasika)
 * @version (5/4/12021 HE)
 */
public class printWeeks
{
    Scanner S = new Scanner(System.in);
    void main()
    {
        System.out.println("Enter number of weeks");
        int weeks = S.nextInt();
        for(int i=1; i<=weeks; i++)
        {
            System.out.println("Week "+i+":");
            for(int j = 1; j<=7; j++)
            {
                System.out.println("Day "+j);
            }
        }
    }
}
