package IT_training;
import java.util.Scanner;
public class Empolyeedatabaseapp {
	public static void main(String[] args) {
		// Ask how many new employee we want to call to do training
		System.out.println("How many new Employee to enroll:");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		// import new scanner here(creating a new array of objects(employee)
		int numOfStudents = in.nextInt();
		Empolyee[] students = new Empolyee[numOfStudents];

		// Create a number of new students
		for (int n = 0; n < numOfStudents; n++) {
			students[n] = new Empolyee();
			students[n].enroll();
			students[n].payTuition();
			
		}
		
		for (int n = 0; n < numOfStudents; n++) {
			System.out.println(students[n].toString());	     
		}
	}

}
