package ClassXII.Recordwork;

import java.util.Scanner;

/** 
 * <Enter question here.>
 * 
 * @author Vinaayak Gopala Dasika
 * @version 1.0
*/

public class TimeToWords_Q1 {
	int h, m;

	/**
	 * The function "input" prompts the user to enter a number between 1 and 12 for hours and a number
	 * between 0 and 59 for minutes.
	 */
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 to 12 and then between 0 to 59");
		h = sc.nextInt();
		m = sc.nextInt();
	}
	/**
	 * The function "cal" determines the time based on the given hour and minute values and prints the
	 * corresponding time statement.
	 */
	void cal() {
		if (m == 0) {
			System.out.println("Time is: " + h + " o’clock.");
		}
		else if (m == 15) {
			System.out.println("Time is: " + "Quarter past " + h);
		}
		else if (m == 30) {
			System.out.println("Time is: " + "Half past " + h);
		}
		else if (m > 0 && m < 30) {
			System.out.println("Time is: " + m + " minutes past " + h);
		}
		else if (m == 45) {
			System.out.println("Time is: " + "Quarter to " + (h + 1));
		}
		else {
			System.out.println("Time is: " + (60 - m) + " minutes to " + (h + 1));
		}
	}
	public static void main(String[] args) {
		TimeToWords_Q1 obj = new TimeToWords_Q1();
		obj.input();
		obj.cal();
	}
}
