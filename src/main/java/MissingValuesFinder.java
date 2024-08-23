import java.util.ArrayList;
import java.util.List;

// How to find the missing values from a sorted array.
public class MissingValuesFinder {
    public static void main(String[] args) {
        int[] sortedArray = {1,2,4,7,8,10};

        List<Integer> missingValues = findMissingValues(sortedArray);

        System.out.println("Missing values in the array: " + missingValues);
    }

    private static List<Integer> findMissingValues(int[] array) {
        List<Integer> missingValues = new ArrayList<>();
        for (int i = 0; i < array.length-1; i++) {
            int current = array[i];
            int next = array[i + 1];

            if (next - current > 1) {
                for (int j = current + 1; j < next; j++){
                    missingValues.add(j);
                }
            }
        }
        return missingValues;
    }
}
