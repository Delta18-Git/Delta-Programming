package ClassX;
import java.util.*;

/**
 * Find factorial of user-input number.
 *
 * @author (Vinaayak G Dasika)
 * @version (24/6/12021 HE)
 */
public class factorialPrint
{
    Scanner S = new Scanner(System.in);
    int factorial, i, x;
    void main()
    {
        input();
        System.out.println("The factorial of " + factorial + " is " + calculate(factorial));
    }
    int calculate(int in)
    {
        int fact = 1;
        for (i = 1; i <= in; i++)
        {
            fact = fact * i;  
        }
        return fact;
    }
    void input()
    {
        System.out.println("Enter the number whose factorial has to be calculated.");
        factorial = S.nextInt();
    }
}
