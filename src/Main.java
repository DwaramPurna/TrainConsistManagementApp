import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("   UC13 - Performance Comparison         ");
        System.out.println("===========================================\n");

        int iterations = 50000;

        // 1. Test ArrayList
        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            arrayList.add(0, i); // Adding at the beginning (Heavy operation)
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList Time: " + (endTime - startTime) + " ns");

        // 2. Test LinkedList
        List<Integer> linkedList = new LinkedList<>();
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            linkedList.add(0, i); // Adding at the beginning (Light operation)
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList Time: " + (endTime - startTime) + " ns");

        System.out.println("\nUC13: Performance data collected.");
    }
}