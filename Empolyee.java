package IT_training;

import java.util.Scanner;

public class Empolyee {
	// using encapsulation will be private
	private String first_Name;
	private String last_Name;
	private int grade_Year;
	private String Employee_ID;
	private String courses = null;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;

	// student class will be our outline and the comments are our methods

	// constructor : prompt user to enter Student's name and year
	public Empolyee() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Employee first name:");
		this.first_Name = in.nextLine();

		System.out.println("Enter Employee last name:");
		this.last_Name = in.nextLine();

		System.out.println("1 - Entry-level\n2 - Intermediate\n3 - Mid-level\4 - Senior\nEnter student class level:");
		this.grade_Year = in.nextInt();

		setEmployeeID();

	}

	// Generate an ID
	private void setEmployeeID() {
		// Grade level + ID
		id++;
		this.Employee_ID = grade_Year + "" + id;
	}

	// Enroll in courses
	public void enroll() {
		// Get inside a loop, user hits 0
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				// always use .equals for strings
				courses = courses + "\n  " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			} else {
				// System.out.println("BREAK!");
				break;
			}
		} while (1 != 0);

		// System.out.println("ENROLLED IN: " + courses);
		// System.out.println("TUITION BALANCE: " + tuitionBalance);
	}

	// View balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}

	// Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your  payment of $" + payment);
		viewBalance();
	}

	// Show Status
	public String toString() {
		return "Name: " + first_Name + " " + last_Name +
				"\nGrade level:" + grade_Year +
				"\nEmployee ID:" + Employee_ID +
				"\nCourses Enrolled:" + courses +
				"\nBalance: $" + tuitionBalance;
	}
}