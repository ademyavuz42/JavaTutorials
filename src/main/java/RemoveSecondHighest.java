import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

// Program Remove the second highest element from the HashMap.
public class RemoveSecondHighest {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Apple");
        map.put(3,"Banana");
        map.put(5,"Orange");
        map.put(2,"Grapes");
        map.put(4,"Mango");

        System.out.println("Original HashMap: " + map);

        removeSecondHighest(map);

        System.out.println("HashMap after removing the second highest key: " + map);
    }

    private static void removeSecondHighest(HashMap<Integer, String> map) {
        if (map.size() < 2) {
            System.out.println("Not enough elements to remove second highest number!");
            return;
        }
        List<Integer> sortedKeys = new ArrayList<>(map.keySet());
        Collections.sort(sortedKeys, Collections.reverseOrder());

        Integer secondHighestKey = sortedKeys.get(1);
        map.remove(secondHighestKey);
    }
}
