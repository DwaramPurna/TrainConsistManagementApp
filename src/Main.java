class CargoSafetyException extends Exception {
    public CargoSafetyException(String message) {
        super(message);
    }
}

public class Main {
    // Logic for UC15
    public static String assignCargo(String bogieType, String cargoType) throws CargoSafetyException {
        if (bogieType.equalsIgnoreCase("Rectangular") && cargoType.equalsIgnoreCase("Petroleum")) {
            throw new CargoSafetyException("Petroleum cannot be assigned to a Rectangular bogie!");
        }
        return "Success";
    }
    public static int[] bubbleSort(int[] capacities) {
        int n = capacities.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    // Swap the elements
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
        return capacities;
    }

    public static void main(String[] args) {
        try {
            System.out.println(assignCargo("Cylindrical", "Petroleum"));
            System.out.println(assignCargo("Rectangular", "Petroleum"));
        } catch (CargoSafetyException e) {
            System.err.println("Caught: " + e.getMessage());
        } finally {
            System.out.println("Validation completed.");
        }
    }
}