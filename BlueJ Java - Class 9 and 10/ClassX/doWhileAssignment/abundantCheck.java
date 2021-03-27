package ClassX.doWhileAssignment;
import java.util.Scanner;
/**
 * A program to check if a number is an abundant number or not. 
 *
 * @author (Vinaayak G Dasika)
 * @version (27/03/12021 HE)
 */
public class abundantCheck
{
    Scanner S = new Scanner(System.in); int num, sum, i;
    void main()
    {
        System.out.println("Enter a number to check.");
        num = S.nextInt();
        sum = 0;
        i = 1;
        do
        {
            if (num % i == 0)
            {
                sum = sum + i;
            }
            i++;
        }while(i<num);
        if(num<sum)
        {
            System.out.println(num + " is an Abundant Number");
        }
        else
        {
            System.out.println(num + " is not an Abundant Number");
        }
    }
}