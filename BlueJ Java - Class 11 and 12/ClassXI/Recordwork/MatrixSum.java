package ClassXI.Recordwork;

import java.util.*;
/**
 * Write a description of class MatrixSum here.
 *
 * @author (Vinaayak Gopala Dasika)
 * @version (04/10/2022)
 */
public class MatrixSum
{
    int one[][];
    int two[][];
    int sum[][];
    int p, q, m, n;
    boolean flag = false;
    public static void main(String[] args)
    {
        MatrixSum obj = new MatrixSum();
        obj.input();
        obj.calc();
        obj.output();
    }
    void input()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows in matrix 1: ");
        p = s.nextInt();
        System.out.print("Enter number of columns in matrix 1: ");
        q = s.nextInt();
        System.out.print("Enter number of rows in matrix 2: ");
        m = s.nextInt();
        System.out.print("Enter number of columns in matrix 2: ");
        n = s.nextInt();
        one = new int[p][q];
        two = new int[m][n];
        System.out.println("Enter all the elements of matrix 1: ");
        for (int i = 0; i < p; i++) 
        {
            for (int j = 0; j < q; j++) 
            {
                one[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter all the elements of matrix 2: ");
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                two[i][j] = s.nextInt();
            }
        }
    }
    void calc()
    {
        if (m == p && n == q)
        {
            sum = new int[p][q];
            flag = true;
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    sum[i][j] = one[i][j] + two[i][j];
                }
            }
        }
    }
    void output()
    {
        System.out.println("The matrix 1 is: ");
        for(int i = 0; i < p; i++)
        {
            for(int j = 0; j < q; j++)
            {
                System.out.print(one[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("The matrix 2 is: ");
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(two[i][j]+" ");
            }
            System.out.println(" ");
        }
        if (flag)
        {
            System.out.println("Matrix after addition:");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    System.out.print(sum[i][j]+" ");
                }
                System.out.println("");
            }
        }
        else
        {
            System.out.println("Addition not possible.");
        }
    }
}
