import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Custom Bogie Class (Reused from UC7)
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("   UC8 - Filter Bogies Using Streams     ");
        System.out.println("===========================================\n");

        // 1. Create the list of bogies
        List<Bogie> trainConsist = new ArrayList<>();
        trainConsist.add(new Bogie("Sleeper", 72));
        trainConsist.add(new Bogie("First Class", 24));
        trainConsist.add(new Bogie("AC Chair", 56));
        trainConsist.add(new Bogie("General", 90));

        System.out.println("Full Train Consist:");
        System.out.println(trainConsist);

        // 2. Define a threshold (e.g., Filter bogies with > 50 seats)
        int capacityThreshold = 50;

        // 3. Use Stream API to filter
        List<Bogie> highCapacityBogies = trainConsist.stream()
                .filter(b -> b.capacity > capacityThreshold) // The Condition
                .collect(Collectors.toList());               // Wrap back into a List

        // 4. Display Results
        System.out.println("\nHigh Capacity Bogies ( > " + capacityThreshold + " seats):");
        highCapacityBogies.forEach(System.out::println);

        System.out.println("\nUC8: Stream filtering logic applied successfully.");
    }
}