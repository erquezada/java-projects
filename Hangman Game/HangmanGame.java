import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class HangmanGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = readWordsFromFile("words.txt");
        if (words.isEmpty()) {
            System.out.println("No words found in the file.");
            return;
        }
        String word = words.get((int) (Math.random() * words.size()));
        StringBuilder guessedWord = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            guessedWord.append('_');
        }
        int attempts = 6;
        boolean gameOver = false;
        System.out.println("Welcome to Hangman!");
        while (!gameOver) {
            System.out.println("Current word: " + guessedWord);
            System.out.println("Attempts left: " + attempts);
            System.out.print("Guess a letter: ");
            char guess = scanner.next().charAt(0);
            boolean correctGuess = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    guessedWord.setCharAt(i, guess);
                    correctGuess = true;
                }
            }
            if (!correctGuess) {
                attempts--;
                System.out.println("Incorrect guess!");
            }
            if (guessedWord.toString().equals(word)) {
                gameOver = true;
                System.out.println("Congratulations! You guessed the word: " + word);
            }
            if (attempts == 0) {
                gameOver = true;
                System.out.println("Game over! The word was: " + word);
            }
        }
        scanner.close();
    }
    private static List<String> readWordsFromFile(String filename) {
        List<String> words = new ArrayList<>();
        try {
            Scanner fileScanner = new Scanner(new File(filename));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (!line.isEmpty()) {
                    words.add(line);
                }
            }
            fileScanner.close();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return words;
    }
}
