package Internals;

import java.util.*;
public class Program10
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic income");
        double basic = sc.nextDouble();
        double hra = 0.3 * basic;
        double da = 0.05 * basic;
        double gross = basic + hra + da;
        System.out.println("Basic Income: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + gross);
    }
}
