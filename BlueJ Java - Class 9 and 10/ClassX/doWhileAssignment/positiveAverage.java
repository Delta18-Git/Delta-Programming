package ClassX.doWhileAssignment;
import java.util.Scanner;
/**
 * A program to find the average of positive numbers entered by the user.
 * The program should terminate when a negative number is entered. 
 *
 * @author (Vinaayak G Dasika)
 * @version (27/03/12021 HE)
 */
public class positiveAverage
{
    int input, flag, accumulator, count; double average;
    Scanner Systemin = new Scanner(System.in);
    void main()
    {
        flag = 0;
        accumulator = 0;
        count = 0;
        do
        {
            System.out.println("Enter a number.");
            input = Systemin.nextInt();
            if(input>0)
            {
                accumulator = accumulator + input;
                count++;
                average = (accumulator/count);
            }
            else if(input == 0)
            {
                accumulator = accumulator + input;
                average = (accumulator/count);
            }
            else
            {
                flag = 1; 
            }
        }while(flag == 0);
        System.out.println("Average = " +average);
    }
}