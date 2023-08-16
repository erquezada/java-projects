# java-projects
# Hangman Game in Java

![Hangman](hangman.png)

This is a simple implementation of the classic Hangman game using Java. In this game, one player thinks of a word, and the other player tries to guess it letter by letter. The game provides a user-friendly interface in the console where players can input their guesses.

## Features

- Randomly selects a word from a list of words stored in a text file.
- Displays the current state of the word with underscores for unguessed letters.
- Tracks the number of attempts remaining for the player.
- Informs the player if a guessed letter is correct or incorrect.
- Ends the game when the player either guesses the word correctly or runs out of attempts.
- Supports customization by allowing you to add more words to the text file.

## Usage

1. Clone or download this repository to your local machine.
2. Compile the `HangmanGame.java` file using a Java compiler.
3. Run the compiled class file using the Java runtime environment.

```bash
javac HangmanGame.java
java HangmanGame

Follow the on-screen instructions to play the Hangman game.
Customization
To customize the list of words used in the game, you can modify the words.txt file. Add one word per line in the file, and the game will randomly select a word from this list.

License
This project is licensed under the MIT License.

Feel free to contribute, report issues, or suggest improvements to make this Hangman game even better!

