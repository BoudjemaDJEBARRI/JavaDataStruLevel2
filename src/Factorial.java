import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("Enter number : ");
        Scanner scan1 = new Scanner(System.in);
        double n1 = scan1.nextDouble();

        double i = 1;
        double facto1 = 1;

        while (i < n1) {
            i++;

            facto1 *=i;
        }
        System.out.println("The Factorial of " + n1 + " is : " + facto1);
    }
}
