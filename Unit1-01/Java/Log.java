import java.util.Scanner;

/*
* The Log program calculates the number of maple logs
* that can be placed on a logging truck based on their
* length and weight.
*
* Maple logs are cut into lengths of either 0.25 m, 0.5 m, or 1 m.
* Maple logs weigh 20 kg/m, and a logging truck can carry 1100 kg.
*
* @author  Evan Beaudoin
* @version 1.0
* @since   2024-02-018
*/

/**
* This program calculates the number of maple logs that can
* be placed on a logging truck.
*/
final class Log {
    /**
     * Constants.
     *
     */
    public static final double MASS_OF_LOGS = 20.0;

    /**
     * Constants.
     *
     */
    public static final int LOGGING_TRUCK_LIMIT = 1100;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException
    * if this is ever called.
    *
    * @throws IllegalStateException if this is ever called
    */
    private Log() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        // Ask user for the length of maple logs
        System.out.print("Enter the length of logs in meters: ");
        final double logLength = scanner.nextDouble();

        // Calculate the weight of one log based on its length
        final double logWeight = logLength * MASS_OF_LOGS;

        // Calculate the number of logs that can be placed on the truck
        final int numOfLogs = (int) (LOGGING_TRUCK_LIMIT / logWeight);

        // Display the result
        System.out.println("Logs placed on the truck: " + numOfLogs);

        System.out.println("\nDone.");

        scanner.close();
    }
}
