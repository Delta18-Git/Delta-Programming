import java.util.*;
/**
 * A class to find the day of the week from the number.
 *
 * @author (Vinaayak)
 * @version (6/11)
 */
public class dayNumber
{
    int number;
    void main()
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number of the day of the week");
        number = S.nextInt();
        if (number <= 1)
        {
          System.out.println("Enter the number of the day of the week");   
        }
    }
}
