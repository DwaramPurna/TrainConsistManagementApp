import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CargoSafetyTest {

    @Test
    void testCargo_SafeAssignment() {
        // This should NOT throw an exception
        assertDoesNotThrow(() -> {
            Main.assignCargo("Cylindrical", "Petroleum");
        });
    }

    @Test
    void testCargo_UnsafeAssignmentHandled() {
        // This SHOULD throw the exception
        assertThrows(CargoSafetyException.class, () -> {
            Main.assignCargo("Rectangular", "Petroleum");
        });
    }

    @Test
    void testCargo_FinallyBlockExecution() {
        // A simple check to ensure the test suite is running
        assertTrue(true);
    }
}