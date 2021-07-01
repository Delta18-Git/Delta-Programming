package ClassX.methodsAssignments;

import java.util.*;
/**
 * Write a program to print all the factors of a number. 
 * The program should have the following functions: 
 * void accept() 
 * void printfactors() 
 * void main()
 * @author (your name)
 * @version (a version number or a date)
 */
public class factors3
{
    Scanner S = new Scanner(System.in);
    int num;
    int i;
    void main()
    {
        accept();
        printfactors();
    }
    void accept()
    {
        System.out.println("Enter a number to use.");
        num = S.nextInt();
    }
    void printfactors()
    {
        for(i = 1; i <= num; i++)
        {
            if (num % i == 0)
            {
                System.out.println("Factor is: "+ i);
            }
        }
    }
}
