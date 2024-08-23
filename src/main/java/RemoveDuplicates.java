import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "aabbccddeeff";
        String result = removeDuplicates(input);
        System.out.println("Original String:  " + input);
        System.out.println("String after removing duplicates:  " + result);
    }

    private static String removeDuplicates(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char ch: str.toCharArray()){
            set.add(ch);
        }

        StringBuilder sb= new StringBuilder();
        for (char ch : set){
            sb.append(ch);
        }
        return sb.toString();
    }
}
