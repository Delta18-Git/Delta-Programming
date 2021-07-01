package ClassX.methodsAssignments;

import java.util.*;
/**
 * Write a program to calculate the discounted price in a bookfair as per the specifications given,
 * Variables: String Bname – stores the name of the book.
 * double price – stores the price of the book.
 * Methods:
 * (i) void Input() – to input and store the name and the price of the book.
 * (ii) void calculate() – To calculate the price after discount. 
 * Discount is calculated based on the following criteria.
 * Price                                             Discount
 * Less than or equal to 1000                        2% of the price
 * More than 1000 and less than or equal to 3000     10% of the price
 * More than 3000                                    15% of the price
 * (iii) void display() – To display the name and price of the book after discount.
 * @author (your name)
 * @version (a version number or a date)
 */
public class discountedCalc
{
    String Bname;
    double price,dprice;
    Scanner S = new Scanner(System.in);
    void input()
    {
        System.out.println("Enter the price of the book.");
        price = S.nextDouble();
        System.out.println("Enter the book name.");
        Bname = S.nextLine();
    }
    void calculate()
    {
        if (price <= 1000)
        {
            dprice = price - (0.02*price);
        }
        else if ((price > 1000) && (price <= 3000))
        {
            dprice = price - (0.1*price);
        }
        else
        {
            dprice = price - (0.15*price);
        }
    }
    void display()
    {
        System.out.println("The discounted price of " + Bname + "is ₹" + price);
    }
    void main()
    {
        input();
        calculate();
        display();
    }
}