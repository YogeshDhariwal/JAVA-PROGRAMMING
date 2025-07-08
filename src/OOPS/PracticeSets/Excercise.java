package OOPS.PracticeSets;
import java.util.Scanner;
import java.util.Random;

class GuessNumber {
    int r;  // The random number
    int n;  // The user's guess
    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    // Constructor to generate a random number between 1 and 100
    public GuessNumber() {
        r = random.nextInt(100) + 1;  // Generates a random number between 1 and 100
    }

    // Method to take user input
    public void takeUserInput() {
        System.out.print("Enter your guess (between 1 and 100): ");
        n = sc.nextInt();
    }

    // Method to check if the user's guess is correct
    public void isCorrect() {
        if (r > n) {
            System.out.println("The random number is greater than your input.");
            takeUserInput();  // Ask the user for a new guess
            isCorrect();      // Recurse to check the new guess
        } else if (r == n) {
            System.out.println("Congratulations! You guessed the correct number!");
        } else {
            System.out.println("The random number is smaller than your input.");
            takeUserInput();  // Ask the user for a new guess
            isCorrect();      // Recurse to check the new guess
        }
    }
}

public class Excercise{
    public static void main(String[] args) {
        GuessNumber g1 = new GuessNumber();  // Create an object of the GuessNumber class
        g1.takeUserInput();  // Ask the user to enter their first guess
        g1.isCorrect();      // Check if the guess is correct
    }
}

