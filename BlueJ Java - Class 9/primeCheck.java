import java.util.Scanner;
import java.lang.Math;
/**
 * A class to check if a number is prime.
 *
 * @author (Vinaayak G Dasika)
 * @version (11/01/2021)
 */
public class primeCheck
{
    void main()
    {
        Scanner S = new Scanner(System.in);
        int num, i, flag = 1;
        System.out.println("Enter a number.");
        num = S.nextInt();
        for (i = 2; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0)
            {
                flag = 0;
                break;
            }
        }
        if (num <= 1)
            flag = 3;
        else if (num == 2)
            flag = 1;
        if (flag == 1)
            System.out.println("The number is prime");
        else if (flag == 2)
            System.out.println("The number is not prime");
        else
            System.out.println("The number is neither prime nor composite.");
    }
}
