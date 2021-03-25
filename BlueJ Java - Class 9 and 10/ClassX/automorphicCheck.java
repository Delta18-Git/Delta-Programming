package ClassX;
import java.util.Scanner;
/**
 * A class to check if a number is automorphiic or not.
 *
 * @author (Vinaayak G Dasika)
 * @version (24/03/12021 HE)
 */
public class automorphicCheck
{
    int digits, num, count = 0, temp, sqr;
    Scanner S = new Scanner(System.in);
    void main()
    {
        System.out.println("Enter a number to check for Automorphic");
        num = S.nextInt();
        temp = num;
        sqr = temp*temp;
        while (temp > 0)
        {
            count++;
            temp = temp/10;
        }
        digits = (int) (sqr%(Math.pow(10,count)));
        if(num == digits)
            System.out.println("Automorphic number");
        else
            System.out.println("Not an Automorphic number");
    }
}
