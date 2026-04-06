// 1. Define the Custom Exception
class CargoSafetyException extends Exception {
    public CargoSafetyException(String message) {
        super(message);
    }
}

public class Main {
    // 2. Method to assign cargo with safety validation
    public static String assignCargo(String bogieType, String cargoType) throws CargoSafetyException {
        // Safety Rule: Rectangular bogies cannot carry Petroleum
        if (bogieType.equalsIgnoreCase("Rectangular") && cargoType.equalsIgnoreCase("Petroleum")) {
            throw new CargoSafetyException("CRITICAL ERROR: Petroleum cannot be assigned to a Rectangular bogie!");
        }
        return "Cargo '" + cargoType + "' successfully assigned to " + bogieType + " bogie.";
    }

    public static void main(String[] args) {
        System.out.println("=== UC15: Safe Cargo Assignment ===");

        // 3. Using try-catch-finally for structured handling
        try {
            System.out.println("Attempting Assignment 1...");
            System.out.println(assignCargo("Cylindrical", "Petroleum")); // Valid

            System.out.println("\nAttempting Assignment 2...");
            System.out.println(assignCargo("Rectangular", "Petroleum")); // Invalid - Throws Exception

        } catch (CargoSafetyException e) {
            // Catching the error so the program continues
            System.err.println("SAFETY ALERT: " + e.getMessage());
        } finally {
            // This block ALWAYS runs, regardless of success or error
            System.out.println("\n[Finally Block] Cargo safety validation process completed.");
        }

        System.out.println("\nProgram execution continues... System is stable.");
    }
}