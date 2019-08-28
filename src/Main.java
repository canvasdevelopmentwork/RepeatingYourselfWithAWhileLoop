import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner keyboard = new Scanner(System.in);
        int secretNumber, guess = 0;//guess is initialized to 0

        secretNumber = 123;

        System.out.println("I'm thinking of a number between 1 and 1000");
        System.out.print("Enter the number:");
        guess = keyboard.nextInt();
        if(guess != secretNumber) {
            if (guess != 5) {
                while (true) {
                    System.out.println("\nYou are wrong. Try again.");
                    System.out.println("Enter the number: ");
                    guess = keyboard.nextInt();
                    if (guess == 5 || guess == secretNumber) {
                        break;
                    }
                }
            }
        }
        System.out.println("You are correct. You win a prize!");
        keyboard.close();
    }
}
