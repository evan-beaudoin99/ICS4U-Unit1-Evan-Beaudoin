/*
* This is the Dice game program.
*
* @author  Evan Beaudoin
* @version 1.0
* @since   2024-02-27
*/

import java.util.Random;
import java.util.Scanner;

/**
* This is the "Dice Game" program.
*/
final class DiceGame {
    /**
    * Constants.
    */
    public static final int MAX_NUMBER = 6;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException
    * if this is ever called.
    *
    * @throws IllegalStateException if this is ever called
    */

    private DiceGame() {
        throw new IllegalStateException("Cannot be instantiated");
    }
    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD
        try {
            final Random random = new Random();
            final int randomNumber = random.nextInt(6) + 1;
            int guess = 0;
            System.out.print("Pick a number between 1 and 6: ");
            guess = scanner.nextInt();
            if (guess < 1 || guess > MAX_NUMBER) {
                System.out.println("Number must be between 1 and 6!");
            } else {
                int tries = 0;
                while (guess != randomNumber) {
                    if (guess < randomNumber) {
                        System.out.println("You are too low!");
                    } else if (guess > randomNumber) {
                        System.out.println("You are too high!");
                    }

                    System.out.print("\nGuess again: ");

                    guess = scanner.nextInt();
                    tries++;
                }

                System.out.println("\nYou are correct!");
                System.out.println("\nGot it in " + (tries + 1) + " tries!");
            }
        } catch (NumberFormatException error) {
            System.out.println("Invalid Input!");
        } finally {
            scanner.close();
            System.out.println("Done.");

        }

    }
}
=======
        final Random random = new Random();

        final int randomNumber = random.nextInt(6) + 1;
        int tries = 0;

        while (true) {
            System.out.print("\nEnter your guess: ");
            final String input = scanner.nextLine();
            tries++;

            try {
                final int guess = Integer.parseInt(input);

                if (guess < 1 || guess > MAX_NUMBER) {
                    System.out.println("Number must be between 1 and 6!");
                    continue;
                }

                if (guess == randomNumber) {
                    System.out.println("You guessedcorrect!");
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("Your guess is too low. ");
                } else {
                    System.out.println("Your guess is too high.");
                }
            } catch (NumberFormatException error) {
                System.out.println("Invalid Input.");
            }
        }

        System.out.println("It took you " + tries + " tries.");
        scanner.close();
    }
}

>>>>>>> 0aae044365984b4b5a3c59ecace3bf51fe97b5c0
