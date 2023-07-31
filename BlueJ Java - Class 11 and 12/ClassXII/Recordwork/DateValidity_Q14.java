package ClassXII.Recordwork;

import java.util.Scanner;

/**
 * <Enter question here.>
 *
 * @author Vinaayak Gopala Dasika
 * @version 26/7/2023
 */
public class DateValidity_Q14 {
	int mnth = 0;
	int day = 0;
	int year = 0;
	boolean thirtyone;
	boolean leap = false;

	/**
	 * The function prompts the user to enter a day, month, and year, and stores the input in
	 * the variables day, mnth, and year.
	 */
	void input() {
		Scanner sysIn = new Scanner(System.in);
		System.out.println("Enter the day followed by month followed by year separated by spaces.");
		day = sysIn.nextInt();
		mnth = sysIn.nextInt();
		year = sysIn.nextInt();
		sysIn.close();
	}

	/**
	 * The function checks if a given date is valid based on the month, year, and day.
	 * 
	 * @return The method is returning a boolean value.
	 */
	boolean valid() {
		if (mnth > 12 || mnth < 0 || year < 0 || day > 31 | day < 0) {
			return false;
		}
		leap = (year % 4 == 0);
		thirtyone = !(mnth == 2 || mnth == 4 || mnth == 6 || mnth == 9 || mnth == 11);
		if ((leap && mnth == 2 && day > 29) || (!leap && mnth == 2 && day > 28) || (!thirtyone && mnth > 30)) {
			return false;
		}
		return true;
	}

	/**
	 * The function "nextDate" returns the next date given the current day, month, and year.
	 * 
	 * @return An array of integers containing the next date in the format [day, month, year].
	 */
	int[] nextDate() {
		int d2 = day, m2 = mnth, y2 = year;
		if ((thirtyone && day < 30) || (!thirtyone && d2 < 29 && m2 != 2) || (m2 == 2 && leap && d2 < 29)
				|| (m2 == 2 && !leap && d2 < 28)) {
			d2++;
		}
		else {
			d2 = 1;
			m2++;
		}
		if (m2 == 13) {
			m2 = 1;
			y2++;
		}
		return new int[] { d2, m2, y2 };
	}

	/**
	 * The function displays the date and checks if it is valid, then prints the next date if
	 * it is valid.
	 */
	void display() {
		System.out.print("The date " + day + "/" + mnth + "/" + year + " is: ");
		if (valid()) {
			System.out.println("VALID");
			System.out.println("Next date is:");
			int[] ans = nextDate();
			System.out.println(ans[0] + "/" + ans[1] + "/" + ans[2]);
		}
		else {
			System.out.println("NOT VALID");
		}
	}

	public static void main(String[] args) {
		DateValidity_Q14 obj = new DateValidity_Q14();
		obj.input();
		obj.display();
	}
}
