package ClassX;
import java.util.*;

/**
 * Write a program to accept and a number print squares of 1 to num.
 *
 * @author (Vinaayak G Dasika)
 * @version (29/06/2021)
 */
public class squareList
{
    int num;
    void accept()
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the end of the list's root.");
        num = S.nextInt();
    }
    void show(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            System.out.println((int)Math.pow(i,2));
        }
    }
    void main()
    {
        accept();
        show(num);
    }
}