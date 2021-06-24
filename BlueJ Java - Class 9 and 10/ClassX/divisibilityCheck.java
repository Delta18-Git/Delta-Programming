package ClassX;
import java.util.*;

/**
 * Write a program to check if num1 is divisible by num2.
 *
 * @author (Vinaayak G Dasika)
 * @version (24/6/2021)
 */
public class divisibilityCheck
{
    int num1, num2;
    Scanner S = new Scanner(System.in);
    void main()
    {
        accept();
        if (check() == true)
        {
            System.out.println(num1 + " is divisible by " + num2);
        }
        else if (check() == false)
        {
            System.out.println(num1 + " is not divisible by " + num2);
        }
    }
    void accept()
    {
        System.out.println("Enter the first number.");
        num1 = S.nextInt();
        System.out.println("Enter the second number.");
        num2 = S.nextInt();
    }
    boolean check()
    {
        if (num1 % num2 == 0)
        {
        return true;
        }
        else
        return false;
    }
}
