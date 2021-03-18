import java.util.*;
import java.lang.*;
/**
 * A Class to find the sum of all the numbers entered by the user. 
 * The Program should executetill a negative number is entered.
 *
 * @author (Vinaayak G Dasika)
 * @version (28/01/2021)
 */
public class whileSum
{
    Scanner S = new Scanner(System.in);
    int sum, in;
    void main()
    {
        System.out.println("Enter a number");
        in = S.nextInt();
        while(in>=0)
        {
            sum += in;
            System.out.println("Enter a number");
            in = S.nextInt();
        }
        System.out.println("The sum is = " + sum);
    }
}
