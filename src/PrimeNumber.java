import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println("Enter Top Number : ");
        Scanner scan1 = new Scanner(System.in);
        int n1 = scan1.nextInt();

        for (int i = 2; i < n1; i++) {
            if (n1 % i == 0) {
                System.out.println(n1 + " : Is Not a Prime Number");
                break;
            } else {
                System.out.println(n1 + " : Is a Prime Number");
                break;
            }

        }
    }
}
