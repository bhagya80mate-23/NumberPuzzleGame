import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static String checkGuess(int guess, int number) {
        if (guess < number) {
            return "Too Low";
        } else if (guess > number) {
            return "Too High";
        } else {
            return "Correct";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("================================");
        System.out.println("      NUMBER GUESSING GAME");
        System.out.println("================================");
        System.out.println("Guess a number between 1 and 100");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            String result = checkGuess(guess, number);

            if (result.equals("Too Low")) {
                System.out.println("Too Low! Try again.");
            } 
            else if (result.equals("Too High")) {
                System.out.println("Too High! Try again.");
            } 
            else {
                System.out.println("Correct! 🎉");
                System.out.println("You guessed it in "
                        + attempts + " attempts.");
            }

        } while (guess != number);

        sc.close();
    }
}
