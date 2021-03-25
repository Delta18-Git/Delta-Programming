package ClassX;
import java.util.Scanner;
/**
 * A class to print numbers from n to 1.
 *
 * @author (Vinaayak G Dasik)
 * @version (25/03/12021 HE)
 */
public class whileReversevar
{
    int i, n;
    Scanner Systemin = new Scanner(System.in);
    void main()
    {
        System.out.println("Enter the number to print from to 1.");
        n = Systemin.nextInt();
        i = n;
        do
        {
            System.out.println(i);
            i--;
        }while(i>=1);
        System.out.println("Printed from " + n + " to 1.");
    }
}
