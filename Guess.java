import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        // Generate secret number between 1 and 10
        Random random = new Random();
        int secretNum = random.nextInt(10) + 1; // Random number between 1 and 10

        int numGuesses = 0;
        int guess = 0;

        Scanner scanner = new Scanner(System.in);

        // Loop until the correct guess
        while (guess != secretNum) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();  // Get the user's guess
            numGuesses++;

            // Give feedback on the guess
            if (guess < secretNum) {
                System.out.println("Your guess is too low.");
            } else if (guess > secretNum) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("You got it!!");
            }
        }

        // Print the number of guesses it took
        System.out.println("It took you " + numGuesses + " guesses.");

        scanner.close();  // Close the scanner
    }
}
