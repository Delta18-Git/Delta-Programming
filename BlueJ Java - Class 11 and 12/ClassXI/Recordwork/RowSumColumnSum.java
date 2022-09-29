package ClassXI.Recordwork;

import java.util.*;
/**
 * Write a description of class RowSumColumnSum here.
 *
 * @author (Vinaayak Gopala Dasika)
 * @version (15/09/2022)
 */
public class RowSumColumnSum
{
    int matrix[][];
    int p, q;
    public static void main()
    {
        RowSumColumnSum obj = new RowSumColumnSum();
        obj.input();
        obj.calc();
    }
    void input()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows in matrix:");
        p = s.nextInt();
        System.out.print("Enter number of columns in matrix:");
        q = s.nextInt();
        matrix = new int[p][q];
        System.out.println("Enter all the elements of matrix:");
        for (int i = 0; i < p; i++) 
        {
            for (int j = 0; j < q; j++) 
            {
                matrix[i][j] = s.nextInt();
            }
        }
    }
    void calc()
    {
        for (int i = 0; i < p; i++) 
        {
            int row = 0;
            for (int j = 0; j < q; j++) 
            {
                row += matrix[i][j];
            }
            System.out.println("Row sum of row " + (i + 1) + " " + row);
        }
        for (int i = 0; i < q; i++) 
        {
            int column = 0;
            for (int j = 0; j < p; j++) 
            {
                column += matrix[j][i];
            }
            System.out.println("Column sum of column " + (i + 1) + " " + column);
        }
    }

}
