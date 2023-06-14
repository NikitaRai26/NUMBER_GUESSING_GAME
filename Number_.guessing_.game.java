import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int score = 0;
        int maxAttempts = 5;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");
        
        int secretNumber = random.nextInt(100) + 1;
        boolean hasWon = false;
        
        while (maxAttempts > 0) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            
            if (guess < secretNumber) {
                System.out.println("Too low!");
            } else if (guess > secretNumber) {
                System.out.println("Too high!");
            } else {
                hasWon = true;
                break;
            }
            
            maxAttempts--;
        }
        
        if (hasWon) {
            score = maxAttempts + 1;
            System.out.println("Congratulations! You guessed the number correctly.");
            System.out.println("Your score is: " + score);
        } else {
            System.out.println("Sorry, you ran out of attempts.");
            System.out.println("The secret number was: " + secretNumber);
            System.out.println("Better luck next time!");
        }
    }
}
