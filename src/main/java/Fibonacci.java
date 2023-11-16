import java.util.Scanner;
public class Fibonacci {
    public static void fibonacci(int n) {
        int n1 = 0;
        int n2 = 1;

        System.out.println("The first " + n + " numbers of Fibonacci: ");

        for (int i = 0; i < n; i++) {
            System.out.println(n1 + " ");

            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    }

    public static void main(String[] args) {
        System.out.println("How many numbers do you want to print from the Fibonacci sequence?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        fibonacci(n);
    }
}
