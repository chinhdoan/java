import java.util.Scanner;
import java.util.InputMismatchException;
public class test11
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner (System.in);
		
		String name;
		int age;


		System.out.println("Hello. What is your name?");
		name = keyboard.next();

		System.out.print("Hi, "+name+"!"); 
		System.out.print("How old are you?");
		try {
		age = keyboard.nextInt();
		System.out.println("Did you know that in five years you will be "+(age+ 5)+"years old?");
		System.out.println("And five years ago you were "+ (age - 5) +"! Imagine that!");
		}
		catch(InputMismatchException  e) {
			System.out.println("Fault");
		}
	
	}
}