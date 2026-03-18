import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * =========================================================
 * MAIN CLASS - TrainConsistManagementApp
 * =========================================================
 * UC3: Track Unique Bogie IDs (Set - HashSet)
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("   UC3 - Track Unique Bogie IDs (Set)     ");
        System.out.println("===========================================\n");

        // 1. Create a HashSet to store unique Bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // 2. Add Bogie IDs (including intentional duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // Intentional Duplicate
        bogieIds.add("BG102"); // Intentional Duplicate

        // 3. Display the results
        System.out.println("Status: Adding bogies BG101, BG102, BG103, BG101, BG102...");

        // HashSet automatically removes duplicates
        System.out.println("Final Unique Bogie IDs: " + bogieIds);
        System.out.println("Total Unique Bogies: " + bogieIds.size());

        System.out.println("\nUC3: Deduplication completed successfully.");
    }
}