import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArraySortTest {

    @Test
    void testSort_BasicAlphabeticalSorting() {
        // Arrange
        String[] input = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};
        String[] expected = {"AC Chair", "First Class", "General", "Luxury", "Sleeper"};

        // Act
        String[] result = Main.sortBogieNames(input);

        // Assert
        assertArrayEquals(expected, result, "The bogie names should be sorted alphabetically.");
    }

    @Test
    void testSort_DuplicateBogieNames() {
        // Arrange
        String[] input = {"Sleeper", "AC Chair", "Sleeper", "General"};
        String[] expected = {"AC Chair", "General", "Sleeper", "Sleeper"};

        // Act
        String[] result = Main.sortBogieNames(input);

        // Assert
        assertArrayEquals(expected, result, "The sorting should handle duplicate names correctly.");
    }
}