import java.util.HashMap;
import java.util.Map;

/**
 * =========================================================
 * MAIN CLASS - TrainConsistManagementApp
 * =========================================================
 * UC6: Map Bogie to Capacity (HashMap)
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("   UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("===========================================\n");

        // 1. Create a HashMap: Key = Bogie Name (String), Value = Capacity (Integer)
        Map<String, Integer> bogieCapacities = new HashMap<>();

        // 2. Map bogies to their respective capacities using put()
        bogieCapacities.put("Sleeper", 72);
        bogieCapacities.put("AC Chair", 56);
        bogieCapacities.put("First Class", 24);
        bogieCapacities.put("Cargo Van", 500); // 500 units of weight

        // 3. Display the mapping
        System.out.println("Bogie Capacity Mapping (Unordered):");

        // 4. Iterate using entrySet() to show Key and Value pairs
        for (Map.Entry<String, Integer> entry : bogieCapacities.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey() + " | Capacity: " + entry.getValue());
        }

        // 5. Fast Lookup example
        System.out.println("\nQuick Lookup:");
        System.out.println("Capacity of 'AC Chair': " + bogieCapacities.get("AC Chair") + " seats");

        System.out.println("\nUC6: Bogie-to-data mapping completed.");
    }
}