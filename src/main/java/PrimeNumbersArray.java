import java.util.Scanner;
public class PrimeNumbersArray {

    public static int[] primeNumberUntilN(int n) {
        int countsPrime = countsPrimeNumberUntilN(n);
        int[] primeArray = new int[countsPrime];

        int index = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primeArray[index++] = i;
            }
        }

        return primeArray;
    }

    public static int countsPrimeNumberUntilN(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Insert a number: ");

        Scanner scanner = new Scanner(System.in);
        int upperLimit = scanner.nextInt();

        int[] primes = primeNumberUntilN(upperLimit);

        System.out.print("Prime numbers up to " + upperLimit + ": ");
        for (int number : primes) {
            System.out.print(number + " ");
        }
    }
}
