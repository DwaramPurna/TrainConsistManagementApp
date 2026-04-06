import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DefensiveSearchTest {

    @Test
    void testSearch_EmptyArrayThrowsException() {
        String[] emptyIds = {};

        // Assert that the specific exception is thrown
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> {
            Main.binarySearchBogie(emptyIds, "ANY_ID");
        });

        // Verify the error message
        assertEquals("Search failed: The train has no bogies assigned!", exception.getMessage());
    }

    @Test
    void testSearch_WithDataDoesNotThrow() {
        String[] ids = {"BG101"};
        assertDoesNotThrow(() -> Main.binarySearchBogie(ids, "BG101"));
    }
}