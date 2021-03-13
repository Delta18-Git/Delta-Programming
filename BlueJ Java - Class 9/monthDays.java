import java.util.*;
/**
 * A class that finds the days in a month.
 *
 * @author (Vinaayak G Dasika)
 * @version (23/11/2020)
 */
public class monthDays
{
    int mnth;
    Scanner S = new Scanner(System.in);
    public void main()
    {
        System.out.println("Enter the number of the mnoth for which you want days");
        mnth = S.nextInt();
        switch(mnth)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: System.out.println("31 days");
            break;
            case 4:
            case 6:
            case 9:
            case 11: System.out.println("30 days");
            break;
            case 2: System.out.println("28 days");
            break;
            default: System.out.println("Invalid input");   
        }
    }
}
