import java.util.Arrays;

public class SortableArray {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 1, 9};
        Arrays.sort(numbers);  
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}