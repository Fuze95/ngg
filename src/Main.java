package numberguessinggame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        boolean running = true;

        while (running) {
            displayMenu();
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    playGame(scanner, game);
                    break;
                case "2":
                    System.out.println("Thank you for playing! Goodbye.");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1 or 2.");
            }
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\n=== Number Guessing Game ===");
        System.out.println("1. Start New Game");
        System.out.println("2. Exit");
        System.out.print("Please choose an option: ");
    }

    private static void playGame(Scanner scanner, Game game) {
        game.startNewGame();
        System.out.println("\nA new game has started!");
        System.out.println("Guess a number between 1 and 100.");

        while (true) {
            System.out.print("Enter your guess: ");
            String input = scanner.nextLine().trim();

            try {
                int guess = Integer.parseInt(input);
                String feedback = game.makeGuess(guess);
                System.out.println(feedback);
                if (game.isCorrectGuess(guess)) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
}