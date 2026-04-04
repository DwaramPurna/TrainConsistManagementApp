import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Custom Bogie Class (Reused from UC7/UC8)
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bogie{Capacity=" + capacity + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("   UC9 - Group Bogies by Type (Map)      ");
        System.out.println("===========================================\n");

        // 1. Create a list with multiple bogies of the same type
        List<Bogie> trainConsist = new ArrayList<>();
        trainConsist.add(new Bogie("Sleeper", 72));
        trainConsist.add(new Bogie("Sleeper", 72));
        trainConsist.add(new Bogie("AC Chair", 56));
        trainConsist.add(new Bogie("First Class", 24));
        trainConsist.add(new Bogie("AC Chair", 56));

        System.out.println("Processing raw train consist list...\n");

        // 2. Use groupingBy to categorize bogies by their name
        Map<String, List<Bogie>> groupedBogies = trainConsist.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // 3. Display the structured report
        System.out.println("--- Grouped Bogie Report ---");
        groupedBogies.forEach((type, list) -> {
            System.out.println("Type: " + type + " | Count: " + list.size() + " | Details: " + list);
        });

        System.out.println("\nUC9: Categorized reporting completed successfully.");
    }
}