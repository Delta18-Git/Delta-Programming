package ClassX.internalstherealoneclass10part1;
import java.util.Scanner;

/**
 * Write a program to input a number and check if it is a SMITH number or not.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class smithNumber6
{
    int findSumPrimeFactors(int n)  
    {  
        int i = 2, sum = 0;  
        while(n > 1)  
        {  
            if(n % i == 0)  
            {  
                sum += findSumOfDigit(i);  
                n /= i;  
            }  
            else  
            {  
                do  
                {  
                    i++;  
                }  
                while(!isPrime(i));  
            }  
        }  
        return sum;  
    }  

    int findSumOfDigit(int n)  
    {  
        int s = 0;  
        while(n > 0)  
        {  
            s += n % 10;  
            n /= 10;  
        }  
        return s;  
    }  

    boolean isPrime(int input)  
    {  
        boolean prime = true;  
        int count = 2;  
        while(count < Math.sqrt(input)) 
        {  
            if(input % count == 0)  
            {  
                prime = false;  
            }  
            count++;  
        }  
        return prime;  
    }  

    void main()  
    {  
        Scanner S = new Scanner(System.in);  
        System.out.println("Enter a number: ");  
        int in = S.nextInt();         
        int sumDigit = findSumOfDigit(in);          
        int sumPrime = findSumPrimeFactors(in);          
        if(sumDigit == sumPrime)  
            System.out.print("The given number is a smith number.");  

        else  
            System.out.print("The given number is not a smith number.");  
    }  
}  
