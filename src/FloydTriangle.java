import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {

        System.out.println(" Enter a number : ");
        Scanner scan1 = new Scanner(System.in);
        int n1 = scan1.nextInt();

        int num1 = 1;
        for (int i = 1; i <= n1; i++) {
            // Sert à ajouter de l'espace pour créer triangle isosceles
            for (int s = i; s <= n1 ; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(num1 + " ");
                num1++;
            }
            System.out.println();
        }
    }
}
