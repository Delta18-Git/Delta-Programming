package ClassXI.Recordwork;
import java.util.Scanner;

/**
 * Write a program to check if a number is a Smith number or not.
 * Program 5
 *
 * @author (Vinaayak Gopala Dasika)
 * @version (Modified on 04/08/2022)
 */
class SmithNumber
{
    int findSumPrimeFactors(int n1)  
    {  
        int factor = 2, sum1 = 0;
        while(n1 != 1)
        { 
            if(n1 % factor == 0)
            { 
                n1 /= factor;
                sum1 += findSumOfDigit(factor);
                continue;
            }
            factor++;
        }
        return sum1;
    }  
    int findSumOfDigit(int n2)  
    {  
        int sum2 = 0;  
        while(n2 > 0)  
        {  
            sum2 += n2 % 10;  
            n2 /= 10;  
        }  
        return sum2;  
    }  
    void start()  
    {  
        Scanner S = new Scanner(System.in);
        System.out.println("Enter a number: ");  
        int in = S.nextInt();         
        int sumDigit = findSumOfDigit(in);          
        int sumPrime = findSumPrimeFactors(in);          
        if(sumDigit == sumPrime)  
            System.out.println(in + " is a Smith number.");  

        else  
            System.out.println(in + " isn't a Smith number.");  
    }  
    public static void main(String[] args)
    {
        SmithNumber obj = new SmithNumber();
        obj.start();
    }
}