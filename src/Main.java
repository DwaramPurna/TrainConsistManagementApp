import java.util.LinkedHashSet;
import java.util.Set;

/**
 * =========================================================
 * MAIN CLASS - TrainConsistManagementApp
 * =========================================================
 * UC5: Preserve Insertion Order of Bogies (LinkedHashSet)
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("   UC5 - Preserve Insertion Order (Set)  ");
        System.out.println("===========================================\n");

        // 1. Create a LinkedHashSet to store unique bogies in order
        Set<String> trainFormation = new LinkedHashSet<>();

        // 2. Attach bogies in a specific sequence
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // 3. Attempt to add a duplicate bogie
        System.out.println("Attempting to add duplicate 'Sleeper'...");
        trainFormation.add("Sleeper");

        // 4. Display final formation
        System.out.println("\nFinal Train Formation (Unique & Ordered):");
        System.out.println(trainFormation);

        // 5. Verify properties
        System.out.println("\nTotal unique bogies attached: " + trainFormation.size());
        System.out.println("UC5: Formation order preserved without duplicates.");
    }
}