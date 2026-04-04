import java.util.ArrayList;
import java.util.List;

// 1. Define the Custom Exception Class (UC14)
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// 2. The Bogie class with Validation logic
class PassengerBogie {
    String type;
    int capacity;

    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        // UC14 Rule: Capacity must be > 0
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero for: " + type);
        }
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return type + " (" + capacity + " seats)";
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("   === Train Consist Management App ===    ");
        System.out.println("   UC14 - Custom Exception Handling        ");
        System.out.println("===========================================\n");

        List<PassengerBogie> train = new ArrayList<>();

        try {
            // Adding valid bogies
            System.out.println("Adding valid bogies...");
            train.add(new PassengerBogie("Sleeper", 72));
            train.add(new PassengerBogie("AC Chair", 56));

            // Adding an invalid bogie (This triggers the exception)
            System.out.println("Attempting to add a bogie with 0 capacity...");
            train.add(new PassengerBogie("General", 0));

        } catch (InvalidCapacityException e) {
            // Handle the error gracefully
            System.err.println("ALERT: " + e.getMessage());
        }

        System.out.println("\nFinal Verified Train Consist:");
        train.forEach(System.out::println);

        System.out.println("\nSystem operation completed successfully.");
    }
}