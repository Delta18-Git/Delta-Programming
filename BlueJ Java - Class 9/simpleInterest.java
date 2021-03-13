import java.io.*;
import java.util.*;
/**
 * A class to calculate simple interest.
 *
 * @author (Vinaayak G Dasika)
 * @version (28/7/2020)
 */
public class simpleInterest
{
    double p,n,r,i;
    void main()
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the principal");
        p = S.nextDouble();
        System.out.println("Enter the number of years");
        n = S.nextDouble();        
        System.out.println("Enter the rate of interest");
        r = S.nextDouble();
        i = (p*n*r)/100.00;
        System.out.println("The interest is: "+i+".");
    }
}
