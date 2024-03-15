import java.util.Arrays;
import java.util.Scanner;
public class ArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        double average = (double) sum / size;

        System.out.println("Sorted array: " + Arrays.toString(array));

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        scanner.close();
    }
}
//ntmp