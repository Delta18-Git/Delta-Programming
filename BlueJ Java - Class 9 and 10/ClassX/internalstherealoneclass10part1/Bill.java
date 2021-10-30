package ClassX.internalstherealoneclass10part1;
import java.util.Scanner;
/**
 * Write a class Bill that calculates the telephone bill of a customer.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Bill
{
    int bno, call;
    String name;
    double amt;
    Bill()
    {
        bno = 0;
        call = 0;
        name = "";
        amt = 0.0;
    }

    Bill(int b, String n, int c)
    {
        bno = b;
        name = n;
        call = c;
    }

    void Calculate()
    {
        int callcopy = call;
        if(call <= 100)
        {
            amt = 0.6 * callcopy;
        }
        else if((call > 100) && (call <= 200))
        {
            amt = 0.6 * 100;
            callcopy -= 100;
            amt += 0.8 * callcopy;
        }
        else if((call > 200) && (call <= 300))
        {
            amt = (0.6 * 100) + (0.8 * 100);
            callcopy -= 200;
            amt += 1.2 * callcopy;
        }
        else
        {
            amt = (0.6 * 100) + (0.8 * 100) + (1.2 * 100);
            callcopy -= 300;
            amt += 1.5 * callcopy;
        }
    }

    void Display()
    {
        System.out.println("Name of Customer:" + name);
        System.out.println("Bill Number:" + bno);
        System.out.println("Number of Calls made:" + call);
        System.out.println("Amount to pay:" + amt);
    }

    void main()
    {
        int b, c;
        String n;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter name");
        n = S.nextLine();
        System.out.println("Enter bill number");
        b = S.nextInt();
        System.out.println("Enter number of calls made");
        c = S.nextInt();
        Bill bill = new Bill(b, n, c);
        bill.Calculate();
        bill.Display();
    }
}
