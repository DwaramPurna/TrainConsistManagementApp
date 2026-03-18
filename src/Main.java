import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS - UseCase1TrainConsistMgmnt
 * =========================================================
 * Use Case 1: Initialize Train and Display Consist Summary [cite: 8]
 */
public class Main {

    public static void main(String[] args) {
        // Display welcome banner [cite: 33]
        System.out.println("===========================================");
        System.out.println("   === Train Consist Management App ===    ");
        System.out.println("===========================================\n");

        // Create a dynamic list to store train bogies [cite: 34]
        List<String> trainConsist = new ArrayList<>();

        // Display initial consist information [cite: 18]
        System.out.println("Train initialized successfully...");

        // Display initial bogie count using size() [cite: 35]
        System.out.println("Initial Bogie Count : " + trainConsist.size());

        // Prints the current state of the train
        System.out.println("Current Train Consist : " + trainConsist);

        // System ready message [cite: 19]
        System.out.println("\nSystem ready for operations...");
    }
}