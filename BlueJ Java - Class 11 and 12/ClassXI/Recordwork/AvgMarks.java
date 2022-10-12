package ClassXI.Recordwork;

import java.util.*;
/**
 * Write a description of class AvgMarks here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class AvgMarks
{
    int m1, m2, m3, m4, m5;
    double avg;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student roll number");
        int num = sc.nextInt();
        System.out.println("Enter student name");
        String name = sc.next();
        System.out.println("Enter marks of 5 subjects");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();
        avg = (m1+m2+m3+m4+m5)/5;
    }
    void display()
    {
        if(avg >= 85)
            System.out.println("Distinction");
        else if(avg < 85 && avg >= 60)
            System.out.println("First Class");
        else if(avg < 60 && avg >= 50)
            System.out.println("Second Class");
        else if(avg > 40)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
    public static void main(String[] args)
    {
        AvgMarks obj = new AvgMarks();
        obj.input();
        obj.display();
    }
}
