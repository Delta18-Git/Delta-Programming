package ClassXI.Recordwork;

import java.util.*;
/**
 * Write a description of class TransposeMatrix here.
 *
 * @author (Vinaayak Gopala Dasika)
 * @version (04/10/2022)
 */
public class TransposeMatrix
{
    int matrix[][];
    int transpose[][];
    int p, q;
    public static void main(String[] args)
    {
        TransposeMatrix obj = new TransposeMatrix();
        obj.input();
        obj.transpose();
        obj.output();
    }
    void input()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows in matrix: ");
        p = s.nextInt();
        System.out.print("Enter number of columns in matrix: ");
        q = s.nextInt();
        matrix = new int[p][q];
        transpose = new int[q][p];
        System.out.println("Enter all the elements of matrix: ");
        for (int i = 0; i < p; i++) 
        {
            for (int j = 0; j < q; j++) 
            {
                matrix[i][j] = s.nextInt();
            }
        }
    }
    void transpose()
    {
        for (int i = 0; i < p; i++) 
        {
            for (int j = 0; j < q; j++) 
            {
                transpose[j][i] = matrix[i][j];
            }
        }
    }
    void output()
    {
        System.out.println("The above matrix before Transpose is ");
        for(int i = 0; i < p; i++)
        {
            for(int j = 0; j < q; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("The above matrix after Transpose is ");
        for(int i = 0; i < q; i++)
        {
            for(int j = 0; j < p; j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
