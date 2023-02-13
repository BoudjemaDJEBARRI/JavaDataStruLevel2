import java.util.Scanner;

public class FibonacciSeries {

    //We use double instead of long because of the huge numbers
    private static double[] fibonacciCashe;

    public static void main(String[] args) {

        System.out.println("Enter Number to calculate Fibonacci Series : ");
        Scanner scan2 = new Scanner(System.in);
        int n1 = scan2.nextInt();

        fibonacciCashe = new double[n1+1];

        for (int i = 0; i <= n1; i++) {
        System.out.print(fibonacci(i) + " - ");
        }
    }

    public static double fibonacci (int n1){

        if (n1 <= 1){
            return n1;
        }

        // A premitive type is olways 0 not null
        if (fibonacciCashe[n1] != 0){
            return fibonacciCashe[n1];
        }

        double fibonacciNumber = (fibonacci(n1-1)+fibonacci(n1-2));
        fibonacciCashe[n1] = fibonacciNumber;
        return fibonacciNumber;
    }

}
