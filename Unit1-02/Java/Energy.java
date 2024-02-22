import java.util.Scanner;

/*
* This program calculates energy using
* Einsteins equation.
*
* @author  Evan Beaudoin
* @version 1.0
* @since   2024-02-21
*/

/**
 * This program calculates the energy (E) using Einstein's equation E = mc^2.
 */

final class Energy {

    /**
     * Constants.
     */
    public static final int SPEED_OF_LIGHT = 299792458;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException
    * if this is ever called.
    *
    * @throws IllegalStateException if this is ever called
    */
    private Energy() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */

    public static void main(String[] args) {
        try {
            final Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the mass of the object (kg): ");
            final String massString = scanner.nextLine();
            if (massString.isEmpty()) {
                throw new NumberFormatException();
            }
            final Double mass = Double.parseDouble(massString);
            if (mass <= 0) {
                throw new NumberFormatException();
            }
            final double energy = mass * Math.pow(SPEED_OF_LIGHT, 2);
            System.out.printf("%.2f kg produces %.6e J.", mass, energy);
            scanner.close();
        } catch (NumberFormatException error) {
            System.out.println("Invalid Input!");
        }

        // Show the program is done
        System.out.println("\nDone.");
    }
}
