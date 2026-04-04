import java.util.ArrayList;
import java.util.List;

// Custom Bogie Class (Reused from previous UCs)
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("   UC10 - Count Total Seats (reduce)     ");
        System.out.println("===========================================\n");

        // 1. Setup the train consist
        List<Bogie> trainConsist = new ArrayList<>();
        trainConsist.add(new Bogie("Sleeper", 72));
        trainConsist.add(new Bogie("AC Chair", 56));
        trainConsist.add(new Bogie("First Class", 24));
        trainConsist.add(new Bogie("General", 90));

        // 2. Aggregate capacities using map and reduce
        // Step A: map(b -> b.capacity) converts Bogie objects to Integers
        // Step B: reduce(0, (a, b) -> a + b) sums them up
        int totalSeats = trainConsist.stream()
                .map(b -> b.capacity)
                .reduce(0, (sum, cap) -> sum + cap);

        // 3. Display Result
        System.out.println("Train Configuration:");
        trainConsist.forEach(b -> System.out.println("- " + b.name + ": " + b.capacity + " seats"));

        System.out.println("\n-------------------------------------------");
        System.out.println("TOTAL SEATING CAPACITY : " + totalSeats);
        System.out.println("-------------------------------------------");

        System.out.println("\nUC10: Total capacity aggregation completed.");
    }
}