import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinearSearchTest {

    @Test
    void testSearch_BogieExists() {
        String[] ids = {"BG101", "BG205", "BG309", "BG412"};
        assertTrue(Main.findBogie(ids, "BG309"), "Should return true if ID is in the list.");
    }

    @Test
    void testSearch_BogieNotFound() {
        String[] ids = {"BG101", "BG205", "BG309"};
        assertFalse(Main.findBogie(ids, "BG999"), "Should return false if ID is missing.");
    }
}