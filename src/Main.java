import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS - TrainConsistManagementApp
 * =========================================================
 * UC2: Add Passenger Bogies to Train (ArrayList Operations)
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("   UC2 - Add Passenger Bogies to Train    ");
        System.out.println("===========================================\n");

        // 1. Create an ArrayList to hold passenger bogies [cite: 165]
        List<String> passengerBogies = new ArrayList<>();

        // 2. CREATE (Add bogies) [cite: 166]
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies + "\n");

        // 3. DELETE (Remove a bogie) [cite: 168]
        passengerBogies.remove("AC Chair");
        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies + "\n");

        // 4. READ (Check existence) [cite: 169]
        System.out.println("Checking if 'Sleeper' exists:");
        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Contains Sleeper? : " + hasSleeper + "\n");

        // 5. Final Consist State [cite: 170]
        System.out.println("Final Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nUC2 operations completed successfully...");
    }
}