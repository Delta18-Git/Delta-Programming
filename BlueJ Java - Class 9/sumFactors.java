import java.util.Scanner;
/**
 * A class to find the sum of all factors of a number.
 *
 * @author (Vinaayak G Dasika)
 * @version (11/01/2021)
 */
public class sumFactors
{
    Scanner S = new Scanner(System.in);
    void main()
    {
        System.out.println("Enter a number to use.");
        int num = S.nextInt();
        int sum = 0;
        for(int i = 1; i <= num; i++)
        {
            if (num % i == 0)
            {
                sum = sum + i;
            }
        }
        System.out.println("Sum of factors is: "+ sum);
    }
}
