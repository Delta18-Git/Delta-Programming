import java.util.*;
/**
 * A class to print nos from x to y.
 *
 * @author (Vinaayak G Dasika)
 * @version (15/12/12020 HE)
 */
public class loopXY
{
    int x,y;
    Scanner Sys = new Scanner(System.in);
    void main()
    {
        System.out.println("Enter the start value");
        x = Sys.nextInt();
        System.out.println("Enter the end value");
        y = Sys.nextInt();
        if (x < y)
        {
            for(int i = x; i <= y; i++)
            {
                System.out.println(i);
            }
        }
        else
        {
            for(int i = x; i >= y; i--)
            {
                System.out.println(i);
            }
        }
    }
}
