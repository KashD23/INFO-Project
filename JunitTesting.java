import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortableArrayTest {
    @Test
    public void testSortIntegers() {
        int[] numbers = {5, 3, 8, 1};
        SortableArray.sortIntegers(numbers);
        assertArrayEquals(new int[]{1, 3, 5, 8}, numbers);
    }
}
