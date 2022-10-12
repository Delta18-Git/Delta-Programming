package ClassXI.Recordwork;

import java.util.Scanner;

/**
 * Write a description of class JulianDay here.
 *
 * @author (Vinaayak Gopala Dasika)
 * @version (08/09/2022)
 */
public class JulianDay
{
    int mnth = 0, day = 0, year = 0, leap = 28, juli = 0;
    void input()
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the day followed by month followed by year separated by spaces.");
        day = S.nextInt();
        mnth = S.nextInt();
        year = S.nextInt();
    }
    void calc()
    {
        if (year % 4 == 0)
            leap = 29; //Number of days in february if is a leap year
        switch(mnth) //Add no. of day in previous months to day of month
        {
            case 1:
                juli = day;
                break;
            case 2:
                juli = 31 + day;
                break;
            case 3:
                juli = 31 + leap + day;
                break;
            case 4:
                juli = 62 + leap + day;
                break;
            case 5:
                juli = 92 + leap + day;
                break;
            case 6:
                juli = 123 + leap + day;
                break;
            case 7: 
                juli = 153 + leap + day;
                break;
            case 8:
                juli = 184 + leap + day;
                break;
            case 9:
                juli = 215 + leap + day;
                break;
            case 10:
                juli = 245 + leap + day;
                break;
            case 11:
                juli = 276 + leap + day;
                break;
            case 12:
                juli = 306 + leap + day;
                break;
            default:
                System.out.println("Invalid date");
                System.exit(0);
        }
    }
    void display()
    {
        System.out.println("The Julian date is " + juli + "."); 
    }
    public static void main(String[] args)
    {
        JulianDay obj = new JulianDay();
        obj.input();
        obj.calc();
        obj.display();
    }
}
