# RepeatingYourselfWithAWhileLoop

import java.util.Scanner;

public class KeepGuessing {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int secretNumber, guess = 0;//guess is initialized to 0
		
		secretNumber = 123;
		
		System.out.println("I'm thinking of a number between 1 and 1000");
		System.out.print("Enter the number:");
		guess = keyboard.nextInt();
		
		while ( guess != secretNumber )
		{
			System.out.println("\nYou are wrong. Try again.");
			System.out.println("Enter the number: ");
			guess = keyboard.nextInt();
		}
		
		System.out.println("You are correct. You win a prize!");
		keyboard.close();
	}
}

The while loop will continue until the test condition is true. 
You can also break out of a while loop by using the keyword ```break```.
Modify the above program to also exit the while loop if the person guesses "5".
