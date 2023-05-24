package ClassXII.Recordwork;
import java.util.Scanner;


/**
 * Accept a 2-D array, perform the following:
 * i) find the sum of the diagonal elements
 * ii) replace principle diagonal with 0.
 * iii) Replace upper triangle matrix and replace it with # symbol.
 *
 * @author (Vinaayak Gopala Dasika)
 * @version (17/05/2023)
 */
public class Matrix_Q25
{
    int[][] matrix;
    char[][] charmat;
    int diagsum = 0, n;
    void input() {
        System.out.println("Enter the size of the 2-D array");
        Scanner S = new Scanner(System.in);
        n = S.nextInt();
        System.out.println("Enter the elements");
        matrix = new int[n][n];
        charmat = new char[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                    matrix[i][j] = S.nextInt();
            }
        }
    }
    void diagsum() {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j || i + j == (n - 1))
                    diagsum += matrix[i][j];
            }
        }
        System.out.println("Sum of all diagonal elements = " + diagsum);
    }
    void replacediag() {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j)
                    matrix[i][j] = 0;
            }
        }
    }
    void uppertri() {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i < j) {
                    System.out.print(matrix[i][j]+" ");
                    charmat[i][j] = '#';
                }
                else {
                    System.out.print("  ");
                    charmat[i][j] = (char) matrix[i][j];
                }
            }
            System.out.println();
        }
    }
    void displayboth()
    {
        System.out.println("Modified array:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Character array:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(charmat[i][j]+" ");
            }
            System.out.println();
        }
    } 
    public static void main(String[] args) {
        Matrix_Q25 obj = new Matrix_Q25();
        obj.input();
        obj.diagsum();
        obj.uppertri();
        obj.replacediag();
        obj.displayboth();
    }
}
