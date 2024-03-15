import java.util.Scanner;
public class AddMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the matrices: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns for the matrices: ");
        int cols = scanner.nextInt();

        int[][] matrix1 = inputMatrix(rows, cols, scanner, "first");
        int[][] matrix2 = inputMatrix(rows, cols, scanner, "second");

        int[][] result = addMatrices(matrix1, matrix2);

        // Display result
        System.out.println("Resultant Matrix:");
        displayMatrix(result);

        scanner.close();
    }

    private static int[][] inputMatrix(int rows, int cols, Scanner scanner, String ordinal) {
        System.out.println("Enter elements for " + ordinal + " matrix:");
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
