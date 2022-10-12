package ClassXI.Recordwork;
import java.util.Scanner;


/**
 * Write a description of class UpperLowerTriangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UpperLowerTriangle
{
    static int x;
    static int array[][];
    void lowerTri(int matrix[][], int row, int col)
    {
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(i < j || i == j) //if the j value is greater it refers to the upper corner.
                {
                    System.out.print("0 ");
                }
                else
                {
                    System.out.print(matrix[i][j]+ " ");
                }
            }
            System.out.println("");
        }
    }
    void upperTri(int matrix[][], int row, int col)
    {
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(i > j || i == j) //if the i value is greater it refers to the lower corner.
                {
                    System.out.print("0 ");
                }
                else
                {
                    System.out.print(matrix[i][j]+" ");
                }
            }
            System.out.println("");
        }
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and columns of the square matrix.");
        x = sc.nextInt();
        array = new int[x][x]; //as only square matrix can have upper and lower triangles.
        System.out.println("Enter every element of the matrix: ");
        for (int i = 0; i < x; i++) 
        {
            for (int j = 0; j < x; j++) 
            {
                array[i][j] = sc.nextInt();
            }
        }
    }
    public static void main()
    {
        UpperLowerTriangle obj = new UpperLowerTriangle();
        obj.input();
        System.out.println("Lower triangle matrix: ");
        obj.lowerTri(array, x, x);
        System.out.println("Upper triangle matrix: ");
        obj.upperTri(array, x, x);
    }
}
