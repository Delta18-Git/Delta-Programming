package ClassXII.Recordwork;

import java.util.Scanner;

/**
 * <Enter question here.>
 *
 * @author Vinaayak Gopala Dasika
 * @version 28/6/2023
 */
public class DayOnDate_Q3 {
	int mnth = 0, day = 0, year = 0;

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
	}

	/**
	 * Using Zeller's congruence, calulates the day of the week on the entered date.
	 */
	void calcday() {
		if (mnth == 1 || mnth == 2) {
			mnth += 12;
		}
		int d = (day + 13 * (mnth + 1) / 5 + year % 100 + (year % 100) / 4 + year / 400 - 2 * year / 100) % 7;
		/*
		 * The line `d = ((d + 5) % 7) + 1;` is used to convert the value of `d` to a range of 1
		 * to 7, representing the days of the week.
		 */
		d = ((d + 5) % 7) + 1;
		System.out.print("The day is a ");
		switch (d) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}
	}

	public static void main(String[] args) {
		DayOnDate_Q3 obj = new DayOnDate_Q3();
		obj.input();
		obj.calcday();
	}
}