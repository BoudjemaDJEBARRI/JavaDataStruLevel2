import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        System.out.println("Enter your multiplication table : ");
        Scanner scan1 = new Scanner(System.in);
        int n1 = scan1.nextInt();

        int multi = 0;
        for (int i = 1; i <= n1; i++) {
            multi = n1*i;
            System.out.println(n1 + " x " + i + " = " + multi);

        }
    }
}
