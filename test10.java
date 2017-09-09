import java.util.Scanner;

public class test10
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner (System.in);

		System.out.println("Please enter the following information so i can sell it for a profit");

		int grade;
		int id;
		double gpa;
		String login;
		String name;
		String lastname;
		System.out.print("First name:");
		name = keyboard.next();
		System.out.print("");

		System.out.print("Last name :");
		lastname = keyboard.next();
		System.out.print("");

		System.out.print("Grade (9-12)");
		grade = keyboard.nextInt();
		System.out.print("");

		System.out.print("Student ID: ");
		id = keyboard.nextInt();
		System.out.print("");

		System.out.print("Login: ");
		login = keyboard.next();
		System.out.print("");

		System.out.print("GPA (0.0 - 4.0): ");
		gpa = keyboard.nextDouble();
		System.out.print("");

		System.out.println("Your information: ");
		System.out.println("	Login: "+lastname);
		System.out.println("	ID: "+id);
		System.out.println("	Name: "+lastname+","+name);
		System.out.println("	GPA: "+gpa);
		System.out.println("	Grade: "+grade);

	}	

}