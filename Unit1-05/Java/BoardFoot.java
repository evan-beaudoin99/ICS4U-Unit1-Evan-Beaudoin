/*
* This program calculates a board foot
*
* @author  Evan Beaudoin
* @version 1.0
* @since   2024-03-04
*/

import java.util.Scanner;

/**
* This is the board foot program.
*/
final class BoardFoot {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private BoardFoot() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Finds the length of the wood for a board foot.
    *
    * @param width of the wood
    * @param height of the wood
    * @return length needed to be considered a board foot
    */
    static double boardFoot(double width, double height) {
        final double boardFoot = 144;
        final double length = boardFoot / (width * height);
        return length;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the width (inches): ");
            final double width = scanner.nextDouble();
            System.out.print("Enter the length (inches): ");
            final double height = scanner.nextDouble();

            if (width < 0 || height < 0) {
                System.out.println("Invalid input");
            } else {

                // Process
                final double length = boardFoot(width, height);

                // Output
                System.out.println("The length needed for exactly 1 board"
                    + " foot is: " + length + " inches");
            }
        } catch (NumberFormatException error) {
            System.out.println("Invalid Input");
        }

        System.out.println("\nDone.");
        scanner.close();
    }
}
