import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int totalScore = 0;
        char playAgain;

        System.out.println("================================");
        System.out.println("      NUMBER GUESSING GAME");
        System.out.println("================================");

        do {

            System.out.println("\nSelect Difficulty:");
            System.out.println("1. Easy (1-50)");
            System.out.println("2. Medium (1-100)");
            System.out.println("3. Hard (1-200)");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            int range;
            int attempts;

            switch (choice) {
                case 1:
                    range = 50;
                    attempts = 8;
                    break;
                case 2:
                    range = 100;
                    attempts = 7;
                    break;
                case 3:
                    range = 200;
                    attempts = 6;
                    break;
                default:
                    System.out.println("Invalid choice! Medium selected.");
                    range = 100;
                    attempts = 7;
            }

            int secretNumber = random.nextInt(range) + 1;
            boolean guessed = false;

            System.out.println("\nGuess a number between 1 and " + range);

            while (attempts > 0) {

                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();

                if (guess == secretNumber) {

                    System.out.println("Congratulations! You guessed correctly.");

                    totalScore += attempts * 10;

                    System.out.println("Score: " + totalScore);

                    guessed = true;
                    break;

                } else if (guess > secretNumber) {
                    System.out.println("Too High!");
                } else {
                    System.out.println("Too Low!");
                }

                attempts--;
                System.out.println("Attempts Left: " + attempts);
            }

            if (!guessed) {
                System.out.println("Game Over!");
                System.out.println("Correct Number was: " + secretNumber);
            }

            System.out.print("\nPlay Again? (Y/N): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'Y' || playAgain == 'y');

        System.out.println("\nFinal Score: " + totalScore);
        System.out.println("Thank You for Playing!");

        sc.close();
    }
}