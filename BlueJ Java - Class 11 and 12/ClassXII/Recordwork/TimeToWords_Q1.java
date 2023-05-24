package ClassXII.Recordwork;
import java.util.Scanner;


public class TimeToWords_Q1
{
    int h, m;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 12 and then between 0 to 59");
        h = sc.nextInt();
        m = sc.nextInt();
    }
    void cal()
    {
        if (m == 0)
            System.out.println("Time is: " + h + " o’clock.");
        else if (m == 15)
            System.out.println("Time is: " + "Quarter past " + h);
        else if (m == 30)
            System.out.println("Time is: " + "Half past " + h);
        else if (m > 0 && m < 30)
            System.out.println("Time is: " + m + " minutes past " + h);
        else if (m == 45)
            System.out.println("Time is: " + "Quarter to " + (h+1));
        else
            System.out.println("Time is: " + (60-m) + " minutes to " + (h+1));
    }
    public static void main(String[] args) 
    {
        TimeToWords_Q1 obj = new TimeToWords_Q1();
        obj.input();
        obj.cal();
    }
}
