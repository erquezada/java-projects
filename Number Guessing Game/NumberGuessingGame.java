import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minRange = 1;
        int maxRange = 100;
        int targetNumber = generateRandomNumber(minRange, maxRange);
        int attempts = 0;
        boolean isCorrect = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + minRange + " and " + maxRange + ". Try to guess it!");

        while (!isCorrect) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < targetNumber) {
                System.out.println("Too low! Try a higher number.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try a lower number.");
            } else {
                isCorrect = true;
                System.out.println("Congratulations! You guessed the number " + targetNumber + " in " + attempts + " attempts.");
            }
        }

        scanner.close();
    }

    private static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
