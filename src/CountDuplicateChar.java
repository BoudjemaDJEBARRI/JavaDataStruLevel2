import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountDuplicateChar {

    public static void main(String[] args) {
        // Input Text
        System.out.println("Enter Sentence : ");
        Scanner scan2 = new Scanner(System.in);
        String text1 = scan2.nextLine();

        // Text to character array
        char[] char1 = text1.toCharArray();

        //Store the characters in HashMap
        Map<Character, Integer> charMap1 = new HashMap<>();
        for (Character ch1 : char1) {
            if (charMap1.containsKey(ch1)){
                charMap1.put(ch1, charMap1.get(ch1) + 1);
            } else {
                charMap1.put(ch1, 1);
            }
        }

        // ???????
        Set<Character> keys1 = charMap1.keySet();
        for (Character ch1 : keys1) {
            if (charMap1.get(ch1) >= 1){
                System.out.println("Character : " + ch1 + " --> " + charMap1.get(ch1) + " times");
            }

        }
    }
}
