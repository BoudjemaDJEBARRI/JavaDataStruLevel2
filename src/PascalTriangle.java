import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {

        System.out.println("Enter a number to calculate PAscal Triangle : ");
        Scanner scan1 = new Scanner(System.in);
        int n1 = scan1.nextInt();
        
        int num1 = 1;

        //Pour gerer l'espace triangle isoceles
        int numEnter = n1;

        for (int i = 0; i < n1 ; i++) {
           // Sert à ajouter de l'espace pour créer triangle isosceles
            for (int s = 0; s <= numEnter; s++) {
                System.out.print(" ");
            }
            num1 = 1;
            for (int j = 0; j <= i ; j++) {
                System.out.print(num1 + " ");
                num1 = num1*(i-j)/(j+1);
            }
            numEnter--;
            System.out.println();
        }

        // Meth2 : Without adding numEnter variable
        for (int i = 0; i < n1 ; i++) {
           // Sert à ajouter de l'espace pour créer triangle isosceles
            for (int s = i; s <= n1; s++) {
                System.out.print(" ");
            }
            num1 = 1;
            for (int j = 0; j <= i ; j++) {
                System.out.print(num1 + " ");
                num1 = num1*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}