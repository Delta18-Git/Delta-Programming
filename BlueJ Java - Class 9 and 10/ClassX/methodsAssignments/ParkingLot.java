package ClassX.methodsAssignments;

import java.util.*;
/**
 * 
 * Write a program to calculate the bill amount for a parking lot.
 * Class Name: ParkingLot
 * Variables : 
 * int vno – to store the vehicle number             
 * int hrs – to store the number of hours the vehicle is parked in the parking lot             
 * double bill – to store the bill amount
 * Methods:
 * void input() – To input and store the vno and hrs.
 * void calculate() – To compute the parking charges at the rate of 3 for the first hour and 1.50 for each additional hour there after.
 * void display() – To display the detail.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ParkingLot
{
    int vno, hrs;
    double bill;
    Scanner S = new Scanner(System.in);
    void input()
    {
        System.out.println("Enter the vehicle number.");
        vno = S.nextInt();
        System.out.println("Enter the hours parked.");
        hrs = S.nextInt();
    }
    void calculate()
    {
        if (hrs <= 1)
        {
            bill = 3;
        }
        else
        {
            bill = 3 + (hrs - 1) * 1.5;
        }
    }
    void display()
    {
        System.out.println("The Parking charges for " + vno + "parked for " + hrs + " hours are ₹" + bill);
    }
    void main()
    {
        input();
        calculate();
        display();
    }
}