/*
* This program checks the mean and median of a list of integers in a text file.
*
* @author  Evan Beaudoin
* @version 1.0
* @since   2024-03-17
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
* This is the program.
*/
final class MeanMedianMode {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private MeanMedianMode() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Finds the mean of a list.
    *
    * @param list of numbers
    * @return mean of the list
    */
    static double findMean(final int[] list) {
        int sumOfNumbers = 0;
        for (int counter = 0; counter < list.length; counter++) {
            sumOfNumbers = sumOfNumbers + list[counter];
        }
        final double mean = (double) sumOfNumbers / list.length;
        return mean;
    }

    /**
    * Finds the median of a list.
    *
    * @param list of numbers
    * @return median of the list
    */
    static double findMedian(final int[] list) {
        Arrays.sort(list);
        final double halfLength = (double) list.length / 2;
        final double remainder = halfLength % 1;
        double median = 0;
        if (remainder != 0) {
            median = list[(int) halfLength];
        } else {
            median = (double) (
                    list[(int) halfLength - 1] + list[(int) halfLength]
                ) / 2;
        }
        return median;
    }

    /**
    * Finds the median of a list.
    *
    * @param list of numbers
    * @return median of the list
    */
    public static int findMode(final int[] list) {
        final Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : list) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int mode = -1;
        int maxFrequency = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mode = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }
        return mode;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        if (args.length == 0) {
            System.out.println("No file name provided.");
            return;
        }

        // Check if input is valid
        try {
            // Find number of lines in the file
            final String fileName = args[0];
            final BufferedReader reader = new BufferedReader(
                                    new FileReader(fileName)
            );
            int lines = 0;
            while (reader.readLine() != null) {
                lines++;
            }
            reader.close();
            // Get array from file
            final Scanner scanner = new Scanner(new File(fileName));
            final int[] array = new int[lines];
            int counter = 0;
            while (scanner.hasNextInt()) {
                array[counter++] = scanner.nextInt();
            }
            // Find mean and mode
            System.out.println("Calculating...");
            final double mean = findMean(array);
            final double median = findMedian(array);
            final double mode = findMode(array);
            System.out.println("The mean is " + mean);
            System.out.println("The median is " + median);
            System.out.println("The mode is " + mode);
            // Close scanner
            scanner.close();
        } catch (NumberFormatException nfe) {
            // Input is invalid
            System.out.println("Array contains a NaN value.");
        } catch (FileNotFoundException nfe) {
            System.out.println("File not found.");
        } catch (IOException nfe) {
            System.out.println("IO exception.");
        }

        // Show the program as done
        System.out.println("\nDone.");
    }
}
