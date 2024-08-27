import java.util.Map;
import java.util.TreeMap;

// A TreeMap stores key-value pairs in a sorted order based on the keys.
public class PrintTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Banana",30);
        treeMap.put("Orange", 40);
        treeMap.put("Apple", 50);
        treeMap.put("Mango", 70);
        System.out.println("TreeMap elements: ");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() +" : "+  entry.getValue());
        }
    }
}
