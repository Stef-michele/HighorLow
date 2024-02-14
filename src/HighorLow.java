import java.util.Scanner;
import java.util.Random;

public class HighorLow
{
    public static void main(String[] args)
    {
        // Scanner and generator
        Scanner in = new Scanner(System.in);
        Random generator = new Random();

        // Generate a random number between 1 and 10
        int randomNumber = generator.nextInt(10) + 1;   // val is 1 to 10

        // Define user guess
        int userGuess;

        // Use a do-while loop to ensure a valid guess
        do {
            // User input for a number
            System.out.print("Guess the number (between 1 and 10): ");

            // Checking for int
            while (!in.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                in.next(); // clear input
            }
            userGuess = in.nextInt();

            // Check if the guess is in the number range
            if (userGuess < 1 || userGuess > 10) {
                System.out.println("Please enter a number between 1 and 10.");
            } else {
                // Provide feedback to the user
                if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number!");
                }

            }
        } while (randomNumber != userGuess); // Continue until the correct guess is made

        // Display the random number
        System.out.println("The random number was: " + randomNumber);
    }
}