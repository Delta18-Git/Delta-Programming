package ClassXII.Recordwork;

import java.util.Scanner;

/**
 * <Enter question here.>
 *
 * @author Vinaayak Gopala Dasika
 * @version 7/6/2023
 */
public class Wages extends Worker {
	int hrs;
	double rate;
	double wage;
	double overtime;

	Wages() {
		super();
		hrs = 0;
		rate = 0;
		wage = 0;
		overtime = 0;
	}

	Wages(String n, int b, int h, double r) {
		super(n, b);
		hrs = h;
		rate = r;
	}

	void calcWage() {
		overtime = hrs * rate;
		wage = overtime + basic;
	}

	void display() {
		System.out.println("Name: " + name);
		System.out.println("Basic Pay: " + basic);
		System.out.println("Overtime Hours: " + hrs);
		System.out.println("Overtime Rate: " + rate);
		System.out.println("Overtime Pay: " + overtime);
		System.out.println("Wage: " + wage);
	}

	void input() {
		Scanner sysIn = new Scanner(System.in);
		System.out.print("Name: ");
		name = sysIn.next();
		System.out.print("Basic: ");
		basic = sysIn.nextInt();
		System.out.print("Hours: ");
		hrs = sysIn.nextInt();
		System.out.print("Rate: ");
		rate = sysIn.nextDouble();
		sysIn.close();
	}

	public static void main(String[] args) {
		Wages w1 = new Wages();
		w1.input();
		w1.calcWage();
		w1.display();
	}
}
