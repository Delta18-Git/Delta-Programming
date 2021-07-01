package ClassX;
import java.util.*;

/**
 * Find factorial from 1 to an user-input number.
 *
 * @author (Vinaayak G Dasika)
 * @version (29/6/2021)
 */
public class factorialList
{
    Scanner S = new Scanner(System.in);
    int m, i, j;
    void main()
    {
        accept();
        for (i = 1; i <= m; i++)
        {
            System.out.println("The factorial of " + i + " is " + fact(i));                        
        }
    }

    int fact(int m)
    {
        int fact = 1;
        for (j = 1; j <= m; j++)
        {
            fact = fact * j;
        }
        return fact;
    }

    void accept()
    {
        System.out.println("Enter the number upto whose factorial has to be calculated.");
        m = S.nextInt();
    }
}
