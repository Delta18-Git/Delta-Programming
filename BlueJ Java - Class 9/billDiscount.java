import java.io.*;
import java.util.*;
/**
 * Write a program to accept the bill amount and calculate the discount based on the following table.  
 *
 * Bill Amount                                          Discount 
 *
 * Less than or equal to Rs. 1000                        2% of price  
 *
 * More than Rs. 1000 and less than or equal to Rs. 3000 10% of price  
 *
 * More than Rs 3000                                     15% of price 
 *
 * @author (Vinaayak G Dasika)
 * @version (11/9/2020)
 */
public class billDiscount
{
    Scanner Inp = new Scanner(System.in);
    double bill, disc;
    void main()
    {
        System.out.println("Enter the bill amount.");
        bill = Inp.nextDouble();
        if (bill <= 1000)
        {
            disc = 0.02 * bill;
        }
        else if(bill > 1000 && bill <=3000)
        {
            disc = 0.1 * bill;
        }
        else
        {
            disc = 0.15 * bill;
        }
        System.out.println("The discount is Rs. " + disc + ".");
        System.out.println("The amount to be paid is Rs. " + (bill - disc) + "."); 
    }
}
