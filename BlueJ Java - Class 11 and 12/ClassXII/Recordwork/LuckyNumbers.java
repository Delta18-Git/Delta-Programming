package ClassXII.Recordwork;

import java.util.Scanner;

/**
 * Write a program to find the Lucky Numbers.
 * Ex: 10
 * 1 2 3 4 5 6 7 8 9 10
 * (Starting with 2nd number, cut all alternate numbers.)
 * 1 (2) 3 (4) 5 (6) 7 (8) 9 (10)
 * (Starting with 3rd number, cut all alternate numbers.)
 * 1 (2) 3 (4) (5) (6) 7 (8) 9 (10)
 * (Starting with 4th number, cut all alternate numbers.)
 * 1 (2) 3 (4) (5) (6) 7 (8) (9) (10)
 * (Since no 5th number, these are the Lucky Numbers.)
 *
 * @author (Vinaayak Gopala Dasika)
 * @version (3/11/2022)
 */
public class LuckyNumbers
{
    void main()
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the limit.");
        int size = S.nextInt();
        int array[] = new int[size];
        for(int i = 0; i < size; i++)
        { 
            array[i] = i + 1;
        }
        int count = 1;
        while(count < size)
        {
            for(int i = count; i < size; i += count)
            {
                for(int j = i; j < size - 1; j++)
                {
                    array[j] = array[j + 1];
                }
                size--;
            }
            count++;
        }
        System.out.println("Lucky numbers less than input are: ");
        for(int i = 0; i < size; i++)
        {
            System.out.print(array[i]+"   ");
        }
    }
}