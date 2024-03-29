package ClassX.internalstherealoneclass10part1;
import java.util.Scanner;


/**
 * Write a program to calculate discount on the cost of purchased items  based on a given criteria.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class ShowRoom
{
    String name;
    long mobno;
    double cost, dis, amount;
    Scanner S = new Scanner(System.in);
    ShowRoom()
    {
        name = "";
        mobno = 0;
        cost = 0.0;
        dis = 0.0;
        amount = 0.0;
    }
    void input()
    {
        System.out.println("Enter customer name:");
        name = S.nextLine();
        System.out.println("Enter mobile number:");
        mobno = S.nextLong();
        System.out.println("Enter cost of items:");
        cost = S.nextDouble();
    }
    void calculate()
    {
        if (cost <= 10000)
            dis = 0.05 * cost;
        else if ((cost > 10000) && (cost <= 20000))
            dis = 0.1 * cost;
        else if ((cost > 20000) && (cost <= 35000))
            dis = 0.15 * cost;
        else
            dis = 0.2 * cost;
    }
    void display()
    {
        System.out.println("Customer Name: " + name);
        System.out.println("Mobile Number: " + mobno);
        System.out.println("Discounted Price: " + (cost - dis));
    }
    void main()
    {
        ShowRoom sr = new ShowRoom();
        sr.input();
        sr.calculate();
        sr.display();
    }
}