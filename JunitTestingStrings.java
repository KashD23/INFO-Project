import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortableArrayTest {

    @Test
    public void testSortStrings() {
        String[] names = {"Dhillon", "Akash", "Singh"};
        String[] expected = {"Akash", "Dhillon", "Singh"};
        SortableArray.sortStrings(names);
        assertArrayEquals(expected, names, "The strings should be sorted alphabetically.");
    }
}
