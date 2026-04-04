import java.util.ArrayList;
import java.util.List;

// 1. UC14: Custom Exception for Invalid Data
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// 2. UC12: Goods Bogie for Safety Checks
class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " [" + cargo + "]";
    }
}

// 3. UC14: Passenger Bogie with Validation
class PassengerBogie {
    String type;
    int capacity;

    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
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
        System.out.println("===========================================\n");

        // --- UC12 Logic: Safety Check ---
        List<GoodsBogie> goodsConsist = new ArrayList<>();
        goodsConsist.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsConsist.add(new GoodsBogie("Open", "Coal"));

        boolean isSafe = goodsConsist.stream().allMatch(b ->
                !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum"));

        System.out.println("Safety Check Passed: " + isSafe);

        // --- UC14 Logic: Exception Handling ---
        try {
            System.out.println("\nCreating Passenger Bogies...");
            PassengerBogie s1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Added: " + s1);

            // This will trigger the exception
            PassengerBogie invalid = new PassengerBogie("General", 0);
        } catch (InvalidCapacityException e) {
            System.err.println("VALIDATION ERROR: " + e.getMessage());
        }

        System.out.println("\nProject UC14 Completed successfully.");
    }
}