import java.util.*;
import java.lang.*;
/**
 * A class using a while loop to input a set of numbers and print their square.
 * The program should execute till the user enters a zero. 
 *
 * @author (Vinaayak G Dasika)
 * @version (28/01/2021)
 */
public class whileSquare
{
    int num;
    Scanner S = new Scanner(System.in);
    void main()
    {
        System.out.println("Enter a set of numbers");
        int count = 1;
        while(count>0)
        {
            num = S.nextInt();
            count = num;
            System.out.println(Math.pow(num,2));
        }
    }
}
