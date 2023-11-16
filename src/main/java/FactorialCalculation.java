import java.util.Scanner;
public class FactorialCalculation {
    public static int iterative(int n) {
        if (n < 0) {
            return -1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int recursive(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * recursive(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Insert a number");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int iterative = iterative(number);
        int recursive = recursive(number);

        System.out.println("The factorial of " + number + " iteratively is: " + iterative);
        System.out.println("The factorial of " + number + " recursively is: " + recursive);
    }
}
