/*This program calculates the number of logs a truck
can carry based on length and mass accordingly
*
* @author  Evan Beaudoin
* @version 1.0
* @since   2024-02-17
*/

import java.util.Scanner;

class Log  {

    public static final int LOGGING_TRUCK_LIMIT = 1100;
    public static final int MASS_OF_LOGS = 20;

    public static void main(final String[] args) {

    try {
	    Scanner sc = new Scanner(System.in);
 
 	    System.out.println("Choose the length of the logs that you would like to move with a truck. ");
            System.out.println("Enter the length of logs in meters between-> 0.25, 0.5, 1: ");
         
	    double length = sc.nextDouble();

            sc.close();

            if (length != 0.25 && length != 0.5 && length != 1) {
                  throw new IllegalArgumentException("Invalid length entered. Please enter 0.25, 0.5, or 1.");
             }

            double number_of_logs = LOGGING_TRUCK_LIMIT / (length * MASS_OF_LOGS);

            System.out.println("The truck can carry: " + number_of_logs + " logs at " + length + " meters");

            System.out.println("\nDone.");
      } catch (Exception e) {
            System.out.println("Invalid Input");
																						            }
  }
}

