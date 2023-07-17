package ClassXII.Recordwork;

import java.util.Scanner;

/**
 * Input a positive number n and print the possible consecutive natural number
 * combinations which are added to result in n.
 *
 * @author Vinaayak Gopala Dasika
 * @version 21/6/2023
 */
public class SumRepresent_Q13 {
	int N;

	/**
	 * The function "input" reads an integer input from the user.
	 */
	void input() {
		Scanner sysIn = new Scanner(System.in);
		N = sysIn.nextInt();
		sysIn.close();
	}

	/**
	 * The function calculates and prints all possible combinations of consecutive numbers
	 * that sum up to a given number N.
	 */
	void sumRep() {
		for (int i = 1; i < N; i++) {
			int sum = 0;
			int k = i;
			boolean flag = false;
			while (sum <= N && k < N) {
				sum += k++;
				if (sum == N) {
					flag = true;
					break;
				}
			}
			if (flag) {
				for (int j = i; j < k - 1; j++) {
					System.out.print(j + "+");
				}
				System.out.println(k - 1);
			}
		}
	}

	public static void main(String[] args) {
		SumRepresent_Q13 obj = new SumRepresent_Q13();
		obj.input();
		obj.sumRep();
	}
}
