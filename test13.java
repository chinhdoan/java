import java.util.Scanner;
public class test13
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner (System.in);

		String name;
		int age;

		System.out.println("Hey, what's your name?");
		name = keyboard.next();
		System.out.println("ok, "+name+", How old are you?");
		age = keyboard.nextInt();


		if (age < 18)
		{
			System.out.println ("you cant vote, "+name);
		}
		if (age < 25)
		{
			System.out.println ("you cant rent a car, "+name);

		}
		if (age < 16)
		{
			System.out.println ("You cant drive, "+name);
		}
		if (age >= 25)
		{
			System.out.println ("You can do anything that's legal, "+name);
		}

	}
}