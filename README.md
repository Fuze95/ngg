# 🎯 Number Guessing Game (Java Console App)

Welcome to the **Number Guessing Game** — a simple console-based Java application where the computer picks a number between **1 and 100**, and you try to guess it!

Test your intuition, sharpen your number sense, and compete for the highest score!

---

## 🧠 How It Works

- The game generates a **random number between 1 and 100**.
- You have unlimited guesses, but your **score starts at 1000** and decreases by 50 for each wrong guess.
- Get feedback: `"Higher!"`, `"Lower!"`, or `"Congratulations!"` when you guess correctly.

---

## 📁 Project Structure

```
NumberGuessingGame/
├── bin/        # Compiled .class files
└── src/        # Java source code
    ├── Game.java
    └── Main.java
```

---

## 🛠️ How to Run

### ✅ Prerequisites

- Java JDK installed (Java 8 or higher)
- Command line or terminal access

### 💡 Compile and Run

1. Open terminal and navigate to the root folder.

2. Compile the source files:

```bash
javac -d bin src/numberguessinggame/*.java
```

3. Run the game:

```bash
java -cp bin numberguessinggame.Main
```

---

## 📸 Screenshot

```
=== Number Guessing Game ===
1. Start New Game
2. Exit
Please choose an option: 1

A new game has started!
Guess a number between 1 and 100.
Enter your guess: 50
Higher! Try again.
Enter your guess: 75
Lower! Try again.
Enter your guess: 63
Congratulations! You've guessed the number 63 in 3 attempts! Your score: 850
```

---

## 🤝 Contributing

Feel free to fork the repo and suggest improvements — maybe add difficulty levels, a GUI, or a leaderboard?

---

Happy guessing! 🔢✨
