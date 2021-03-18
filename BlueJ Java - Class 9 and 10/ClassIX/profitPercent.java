import java.io.*;
import java.util.*;
/**
 * A program to calculate the profit percentage.
 *
 * @author (Vinaayak G Dasika)
 * @version (28/7/2020)
 */
public class profitPercent
{
    double cp,p,percent;
    void main()
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the profit of the product.");
        p = S.nextDouble();
        System.out.println("Enter the cost price of the product.");
        cp = S.nextDouble();
        percent = 100.00 * (p/cp);
        System.out.println("The profit percentage is: "+percent+"%.");
    }
}
