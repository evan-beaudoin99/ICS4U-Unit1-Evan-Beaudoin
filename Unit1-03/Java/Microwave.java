import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Microwave {
    public static void main(String[] args) {
        // variables
        Map<String, Integer> cookTimes = new HashMap<String, Integer>();
        cookTimes.put("pizza", 45);
        cookTimes.put("soup", 105);
        cookTimes.put("sub", 60);

        // input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the food you want to heat: ");
        String item = scanner.nextLine();
        System.out.print("Enter the quantity of food you want to heat: ");
        int amount = scanner.nextInt();
        double increaseMultiplier = 1;

        // process
        if (cookTimes.containsKey(item) && (amount > 0 && amount <= 3)) {
            if (amount == 2) {
                increaseMultiplier = 1.5;
            } else if (amount == 3) {
                increaseMultiplier = 2;
            }

            double totalTime = (int) (cookTimes.get(item) * increaseMultiplier);
            double minutes = Math.floor(totalTime) / 60;
            double seconds = totalTime % 60;

            System.out.println("Cook time is " + minutes + " minutes and " + seconds + " seconds.");
        } else {
            System.out.println("\nInvalid Input");
        }

        System.out.println("\nDone.");
        scanner.close();
    }
}

