/*
* This is the microwave problem
*
* @author  Evan Beaudoin
* @version 1.0
* @since   2024-02-26
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
* Program calculates microwave cook time.
*/
final class Microwave {

    /**
     * Time required to cook a pizza (in minutes).
     */
    public static final int PIZZA_TIME = 45;

    /**
     * Time required to cook soup (in minutes).
     */
    public static final int SOUP_TIME = 105;

    /**
     * Time required to prepare a sub sandwich (in minutes).
     */
    public static final int SUB_TIME = 60;
    /**
     * Max number.
     */
    public static final int MAX = 3;
    /**
     * Min Number.
     */
    public static final int MIN = 0;
    /**
     * 60 seconds is equal to one minute.
     */
    public static final int MINUTE = 60;
<<<<<<< HEAD
    /**
     * Multiplier for a quantity of 2.
     */
    public static final double TWO_QUANTITY_MULTIPLIER = 1.5;
=======
>>>>>>> 8b0d107863e66554a319a9500c8df1f2d7d57d5b

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException
    * if this is ever called.
    *
    * @throws IllegalStateException if this is ever called
    */

    private Microwave() {
        throw new IllegalStateException("Cannot be instantiated");
    }
    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(String[] args) {
        // variables
        final Map<String, Integer> cookTimes = new HashMap<String, Integer>();
        cookTimes.put("pizza", PIZZA_TIME);
        cookTimes.put("soup", SOUP_TIME);
        cookTimes.put("sub", SUB_TIME);

        // input
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the food you want to heat: ");
        final String item = scanner.nextLine();
        System.out.print("Enter the quantity of food you want to heat: ");
        final int amount = scanner.nextInt();
<<<<<<< HEAD
        double increaseMultiplier = 1;
=======
        final int increaseMultiplier = 1;
>>>>>>> 8b0d107863e66554a319a9500c8df1f2d7d57d5b

        // process
        if (cookTimes.containsKey(item) && amount > MIN && amount <= MAX) {
            if (amount == 2) {
<<<<<<< HEAD
                increaseMultiplier = TWO_QUANTITY_MULTIPLIER;
            } else if (amount == MAX) {
                increaseMultiplier = 2;
=======
                final double increaseMultiplier = 1.5;
            } else if (amount == MAX) {
                final int increaseMultiplier = 2;
>>>>>>> 8b0d107863e66554a319a9500c8df1f2d7d57d5b
            }

            final double totalTime = cookTimes.get(item) * increaseMultiplier;
            final int minutes = (int) Math.floor(totalTime) / MINUTE;
            final double seconds = totalTime % MINUTE;

<<<<<<< HEAD
            System.out.printf("\nTime is %d minutes and "
=======
            System.out.printf("Time is %d minutes and"
>>>>>>> 8b0d107863e66554a319a9500c8df1f2d7d57d5b
                          + "%.1f seconds.", minutes, seconds);

        } else {
            System.out.println("\nInvalid Input");
        }

        System.out.println("\nDone.");
        scanner.close();
    }
}

