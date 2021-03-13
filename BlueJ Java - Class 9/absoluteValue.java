import java.io.*;
import java.util.*;
import java.lang.*;
/**
 * A class to get the absolute value of a number.
 * @author (Vinaayak)
 * @version (10/8/2020)
 */
public class absoluteValue
{
    int a;
    void main()
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number.");
        a = S.nextInt();
        System.out.println("The absolute value of the number = " + Math.abs(a));
    }
}
