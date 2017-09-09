import java.util.Scanner;

public class test9
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner (System.in);

		String name;
		int age;
		int number;

		System.out.println("Hello. What is your name?");
		name = keyboard.next();
		System.out.println("Hi, Dennis! How old are you?");
		age = keyboard.nextInt();
		System.out.println("So you 're "+age+", eh? That 's not old at all!");
		System.out.println("How much do you make, Dennis?");
		number = keyboard.nextInt();

		System.out.println(number+"! i hope that's per hour and not per year! LOL!");	
	}
}