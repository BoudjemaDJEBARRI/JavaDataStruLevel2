import java.util.Scanner;

public class CountWordCharacter {

    public static void main(String[] args) {

        //Insert Text
        System.out.println("Enter the string :");
        Scanner scan1 = new Scanner(System.in);
        String s1 = scan1.nextLine();

        // *** Count Characters Without Conditions ***
        System.out.println("Number of letters :" + s1.length());

        // *** Count Characters ***
        int countChar = 1;
        for (int i = 0; i < s1.length() - 1; i++) {
            if (s1.charAt(i) != ' ') {
                countChar++;
            }
        }
            System.out.println("Number of letters With Conditions :" + countChar);

        // *** Count Words ***
        int count = 1;
        for (int i = 1; i < s1.length(); i++) {
            if (s1.charAt(i) == ' ' && s1.charAt(i + 1) != ' ') {
                count++;
            }
        }
        System.out.println("Number of Words :" + count);
    }
}

