import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountDuplicateWord {

    public static void main(String[] args) {
        // Input Text
        System.out.println("Enter Sentence : ");
        Scanner scan2 = new Scanner(System.in);
        String text1 = scan2.nextLine();

        // Text to character array
        String[] words1 = text1.split(" ");

        //Store the characters in HashMap
        Map<String, Integer> map3 = new HashMap<>();
        for (String w1 : words1) {
            if (map3.containsKey(w1)) {
                map3.put(w1, map3.get(w1) + 1);

            } else {
                map3.put(w1, 1);
            }
        }

        // ???????
        Set<String> keys1 = map3.keySet();
        for (String w1 : keys1) {
            if (map3.get(w1) >= 1) {
                System.out.println("Word : " + w1 + " --> " + map3.get(w1) + " times");
            }
        }
    }
}
