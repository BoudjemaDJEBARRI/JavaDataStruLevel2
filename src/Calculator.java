import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        double a = scan1.nextDouble();
        System.out.print("Enter Second Numbers : ");
        double b = scan1.nextDouble();

        System.out.print("Enter Operator : ");
        char op1 = scan1.next().charAt(0);

        double c = 0;

        switch (op1){
            case '+' : c = a + b; break;
            case '-' : c = a - b; break;
            case '*' : c = a * b; break;
            case '/' : c = a / b; break;
            case '%' : c = a % b; break;
            default  : System.err.println("Operator unknown");
        }

        System.out.println(c);
    }

}
