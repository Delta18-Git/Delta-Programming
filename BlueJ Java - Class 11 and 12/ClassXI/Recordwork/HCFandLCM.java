package ClassXI.Recordwork;
import java.util.Scanner;

/**
 * Write a description of class HCFandLCM here.
 *
 * @author (Vinaayak Gopala Dasika)
 * @version (11/08/2022)
 */
public class HCFandLCM
{
    int input1, input2, hcf = 1, lcm;
    void calculate()
    {
        int small;
        small = Math.min(input1, input2);
        for(int i = 1; i <= small; i++)
        {
            if(input1%i == 0 && input2%i == 0)
            {
                hcf = i;
            }
        }
        int product = input1 * input2;
        lcm = product/hcf;
    }
    void input()
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the numbers seperated by a space.");
        input1 = S.nextInt();
        input2 = S.nextInt();
    }
    void output()
    {
        System.out.println("HCF of " + input1 + " and " + input2 + " = " + hcf);
        System.out.println("LCM of " + input1 + " and " + input2 + " = " + lcm);    
    }  
    void main()
    {
        HCFandLCM obj = new HCFandLCM();
        obj.input();
        obj.calculate();
        obj.output();
    }
}