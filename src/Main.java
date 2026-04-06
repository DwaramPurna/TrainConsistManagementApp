import java.util.Arrays;

// UC15: Custom Exception
class CargoSafetyException extends Exception {
    public CargoSafetyException(String message) {
        super(message);
    }
}

public class Main {

    // UC15: Safe Cargo Assignment
    public static String assignCargo(String bogieType, String cargoType) throws CargoSafetyException {
        if (bogieType.equalsIgnoreCase("Rectangular") && cargoType.equalsIgnoreCase("Petroleum")) {
            throw new CargoSafetyException("Petroleum cannot be assigned to a Rectangular bogie!");
        }
        return "Success";
    }

    // UC16: Manual Bubble Sort (Manual Logic)
    public static int[] bubbleSort(int[] capacities) {
        int n = capacities.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
        return capacities;
    } // <--- This brace closes bubbleSort correctly

    // UC17: Optimized Sorting (Built-in Logic)
    public static String[] sortBogieNames(String[] names) {
        Arrays.sort(names);
        return names;
    }

    public static void main(String[] args) {
        System.out.println("--- Train Management System Loaded ---");
        // UC15 Test
        try {
            System.out.println("UC15 Assignment: " + assignCargo("Cylindrical", "Petroleum"));
        } catch (CargoSafetyException e) {
            System.err.println("Caught: " + e.getMessage());
        }

        // UC16 & UC17 verification prints
        int[] caps = {72, 56, 24};
        System.out.println("UC16 Sorted Capacities: " + Arrays.toString(bubbleSort(caps)));

        String[] names = {"Sleeper", "AC Chair", "General"};
        System.out.println("UC17 Sorted Names: " + Arrays.toString(sortBogieNames(names)));
    }
}