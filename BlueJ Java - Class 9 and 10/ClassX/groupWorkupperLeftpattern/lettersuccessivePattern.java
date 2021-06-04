package ClassX.groupWorkupperLeftpattern;
import java.util.Scanner;
/**
 * Write a description of class lettersuccessivePattern here.
 *
 * @author (Vinaayak G Dasika)
 * @version (29/04/2021)
 */
public class lettersuccessivePattern
{
    void main()
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = S.nextInt();
        for(int i = n; i >= 1; i--)
        {
            char x = 'A';
            for(int j = 1; j<=i; j++)
            {
                System.out.print(x);
                x++;
            }
            System.out.println();            
        }
    }
}
