import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS - TrainConsistManagementApp
 * =========================================================
 * UC1: Initialize Train and Display Consist Summary
 */
public class Main {

    public static void main(String[] args) {
        // Display welcome banner [cite: 33]
        System.out.println("===========================================");
        System.out.println("   === Train Consist Management App ===    ");
        System.out.println("===========================================\n");

        // Initialize an empty List using ArrayList [cite: 25, 34]
        List<String> trainConsist = new ArrayList<>();

        // Display initial information
        System.out.println("Train initialized successfully...");

        // Display the initial bogie count [cite: 18, 35]
        System.out.println("Initial Bogie Count : " + trainConsist.size());

        // Prints the current state of the train [cite: 11]
        System.out.println("Current Train Consist : " + trainConsist);

        System.out.println("\nSystem ready for operations...");
    }
}