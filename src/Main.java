import java.util.regex.Pattern;

/**
 * =========================================================
 * MAIN CLASS - TrainConsistManagementApp
 * =========================================================
 * UC11: Validate Train ID & Cargo Codes (Regex)
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("   UC11 - Input Validation (Regex)       ");
        System.out.println("===========================================\n");

        // 1. Define Regex Patterns
        // TRN- followed by exactly 4 digits
        String trainIdPattern = "^TRN-\\d{4}$";
        // 3 Uppercase letters, a hyphen, and 2 Uppercase letters
        String cargoCodePattern = "^[A-Z]{3}-[A-Z]{2}$";

        // 2. Test Inputs
        String testTrainId = "TRN-1234";
        String testCargoCode = "PET-AB";
        String invalidId = "TRAIN123";

        // 3. Perform Validation using Pattern.matches()
        System.out.println("Validating Train ID: " + testTrainId);
        boolean isIdValid = Pattern.matches(trainIdPattern, testTrainId);
        System.out.println("Is Valid? : " + isIdValid);

        System.out.println("\nValidating Cargo Code: " + testCargoCode);
        boolean isCargoValid = Pattern.matches(cargoCodePattern, testCargoCode);
        System.out.println("Is Valid? : " + isCargoValid);

        System.out.println("\nValidating Invalid ID: " + invalidId);
        boolean isInvalidMatch = Pattern.matches(trainIdPattern, invalidId);
        System.out.println("Is Valid? : " + isInvalidMatch);

        System.out.println("\nUC11: Regex validation logic implemented.");
    }
}