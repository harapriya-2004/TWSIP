import java.util.*;
class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int minRange = 1;       // Minimum number in the range
        int maxRange = 100;     // Maximum number in the range
        int maxAttempts = 8;   // Maximum number of attempts

        int secretNumber = r.nextInt(maxRange - minRange + 1) + minRange;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You will be asked to guess a number between "+minRange+" and "+maxRange+" to win the Game...");
        System.out.println("You have Maximum 8 attempts limit...");
        
        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            attempts++;

            if (guess < minRange || guess > maxRange) {
                System.out.println("Your guess is out of the valid range.");
            } else if (guess >secretNumber) {
                System.out.println("Your guess number is Greater.");
            } else if (guess < secretNumber) {
                System.out.println("Your guess number is Smaller.");
            } else {
                hasGuessedCorrectly = true;
                break;
            }

            int remainingAttempts = maxAttempts - attempts;
            System.out.println("Attempts remaining: " + remainingAttempts);
        }

        if (hasGuessedCorrectly) {
            System.out.println("Congratulations! You've guessed the number (" + secretNumber + ") correctly in " + attempts + " attempts.You Win the Game!");
        } else {
            System.out.println("Sorry, you've run out of attempts.You Lose the Game!");
        }

        sc.close();
    }
}