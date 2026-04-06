import java.util.Arrays;

// UC15: Custom Exception for Cargo Safety
class CargoSafetyException extends Exception {
    public CargoSafetyException(String message) {
        super(message);
    }
}

public class Main {

    // --- UC20: Defensive Validation ---
    /**
     * Ensures the bogie collection is not empty before operations.
     * Throws IllegalStateException if the array is null or empty.
     */
    private static void validateState(String[] ids) {
        if (ids == null || ids.length == 0) {
            throw new IllegalStateException("Search failed: The train has no bogies assigned!");
        }
    }

    // --- UC15: Cargo Assignment ---
    public static String assignCargo(String bogieType, String cargoType) throws CargoSafetyException {
        if (bogieType.equalsIgnoreCase("Rectangular") && cargoType.equalsIgnoreCase("Petroleum")) {
            throw new CargoSafetyException("Petroleum cannot be assigned to a Rectangular bogie!");
        }
        return "Success";
    }

    // --- UC16: Manual Bubble Sort (Integers) ---
    public static int[] bubbleSort(int[] capacities) {
        int n = capacities.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
        return capacities;
    }

    // --- UC17: Optimized Sorting (Strings) ---
    public static String[] sortBogieNames(String[] names) {
        if (names != null) {
            Arrays.sort(names);
        }
        return names;
    }

    // --- UC18: Linear Search ---
    public static boolean findBogieLinear(String[] ids, String target) {
        validateState(ids); // UC20 Validation
        for (String id : ids) {
            if (id.equalsIgnoreCase(target)) {
                return true;
            }
        }
        return false;
    }

    // --- UC19: Binary Search (Optimized) ---
    public static int binarySearchBogie(String[] ids, String target) {
        validateState(ids); // UC20 Validation

        int low = 0;
        int high = ids.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = target.compareTo(ids[mid]);

            if (comparison == 0) {
                return mid;
            } else if (comparison > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("=== Train Management System Console ===");

        // 1. Demonstrate UC17 (Sorting) and UC19 (Binary Search)
        String[] bogies = {"BG500", "BG100", "BG400", "BG200"};
        System.out.println("Unsorted: " + Arrays.toString(bogies));

        sortBogieNames(bogies);
        System.out.println("Sorted (UC17): " + Arrays.toString(bogies));

        int index = binarySearchBogie(bogies, "BG400");
        System.out.println("Binary Search (UC19): BG400 found at index " + index);

        // 2. Demonstrate UC20 (Defensive Programming / Fail-Fast)
        System.out.println("\nTesting Empty Train Validation (UC20):");
        try {
            String[] emptyTrain = {};
            binarySearchBogie(emptyTrain, "BG100");
        } catch (IllegalStateException e) {
            System.err.println("Caught Expected Exception: " + e.getMessage());
        }
    }
}