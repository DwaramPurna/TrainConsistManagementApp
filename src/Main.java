import java.util.LinkedList;

/**
 * =========================================================
 * MAIN CLASS - TrainConsistManagementApp
 * =========================================================
 * UC4: Maintain Ordered Bogie IDs (LinkedList Operations)
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("   UC4 - Maintain Ordered Bogie IDs      ");
        System.out.println("===========================================\n");

        // 1. Create a LinkedList to model the physical train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // 2. Add bogies to the consist
        trainConsist.add("Sleeper");
        trainConsist.add("AC Coach");
        trainConsist.add("Cargo Van");

        // 3. Add to Head and Tail
        trainConsist.addFirst("Locomotive"); // Engine at the front
        trainConsist.addLast("Guard Van");    // Guard at the back

        System.out.println("Initial Consist (Sequential):");
        System.out.println(trainConsist + "\n");

        // 4. Positional Insertion (Add Pantry Car at index 2)
        trainConsist.add(2, "Pantry Car");
        System.out.println("After adding 'Pantry Car' at index 2:");
        System.out.println(trainConsist + "\n");

        // 5. Head and Tail Removal
        trainConsist.removeFirst(); // Detaching Engine
        trainConsist.removeLast();  // Detaching Guard

        System.out.println("After detaching Engine and Guard:");
        System.out.println("Final Consist: " + trainConsist);

        System.out.println("\nUC4: Sequential ordering maintained successfully.");
    }
}