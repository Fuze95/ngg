package numberguessinggame;

import java.util.Random;

public class Game {
    private int targetNumber;
    private int attempts;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private Random random;

    public Game() {
        random = new Random();
        startNewGame();
    }

    public void startNewGame() {
        targetNumber = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
        attempts = 0;
    }

    public String makeGuess(int guess) {
        attempts++;
        if (guess < MIN_NUMBER || guess > MAX_NUMBER) {
            return "Please enter a number between " + MIN_NUMBER + " and " + MAX_NUMBER + ".";
        }
        if (guess < targetNumber) {
            return "Higher! Try again.";
        } else if (guess > targetNumber) {
            return "Lower! Try again.";
        } else {
            return "Congratulations! You've guessed the number " + targetNumber + " in " + attempts + " attempts!";
        }
    }

    public boolean isCorrectGuess(int guess) {
        return guess == targetNumber;
    }
}