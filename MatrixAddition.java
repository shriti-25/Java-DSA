import java.util.Scanner;

class MatrixAddition {

    public static void main(String[ ] args) {

        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Create matrices
        int x[ ][ ]  = new int[rows][cols];
        int y[ ][ ] = new int[rows][cols];

        // Input first matrix
        System.out.println("Enter elements of First Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                x[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("\nEnter elements of Second Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                y[i][j] = sc.nextInt();
            }
        }

        // Print first matrix
        System.out.println("\nFirst Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }

        // Print second matrix
        System.out.println("\nSecond Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(y[i][j] + "\t");
            }
            System.out.println();
        }

        // Call matrix addition method
        matrixAdd(x, y);

        sc.close();
    }

    // Method for matrix addition
    static void matrixAdd(int x[ ][ ] , int y[ ][ ] ) {

        int[ ][ ] sum = new int[x.length][x[0].length];

        System.out.println("\nAddition of Matrices:");

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                sum[i][j] = x[i][j] + y[i][j];
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }
    }
}