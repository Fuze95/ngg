package numberguessinggame;

import java.util.Random;

public class Game {
    private int targetNumber;
    private int attempts;
    private int score;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final int INITIAL_SCORE = 1000;
    private static final int SCORE_DECREMENT = 50;
    private Random random;

    public Game() {
        random = new Random();
        startNewGame();
    }

    public void startNewGame() {
        targetNumber = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
        attempts = 0;
        score = INITIAL_SCORE;
    }

    public String makeGuess(int guess) {
        attempts++;
        score = Math.max(0, INITIAL_SCORE - (attempts * SCORE_DECREMENT));
        
        if (guess < MIN_NUMBER || guess > MAX_NUMBER) {
            return "Please enter a number between " + MIN_NUMBER + " and " + MAX_NUMBER + ".";
        }
        if (guess < targetNumber) {
            return "Higher! Try again.";
        } else if (guess > targetNumber) {
            return "Lower! Try again.";
        } else {
            return "Congratulations! You've guessed the number " + targetNumber + 
                   " in " + attempts + " attempts! Your score: " + score;
        }
    }

    public boolean isCorrectGuess(int guess) {
        return guess == targetNumber;
    }

    public int getScore() {
        return score;
    }
}