import java.util.Scanner;
public class BinarySearch {
    int binarySearch(int array[], int numToFind) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (numToFind < array[mid]) {
                right = mid - 1;
            } else if (numToFind > array[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void bubbleSort(int[] array){
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Insert a number between 1 and 20");
        Scanner scanner = new Scanner(System.in);

        int array[] = {20, 14, 15, 18, 17, 2, 1, 3, 5, 7, 6, 4, 8, 9, 10, 13, 12, 16, 11, 19};

        bubbleSort(array);

        BinarySearch bs = new BinarySearch();
        int numToFind = scanner.nextInt();
        int result = bs.binarySearch(array, numToFind);

        if (result == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present at index " + result);
        }
    }
}