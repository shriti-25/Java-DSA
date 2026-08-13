import java.util.Scanner;

class MatrixMul {

    void matrixmult(int x[ ][ ], int y[ ][ ], int r1, int c1, int r2, int c2) {

        int z[ ][ ] = new int[r1][c2];

        // Matrix Multiplication
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {

                int sum = 0;

                for (int k = 0; k < c1; k++) {
                    sum = sum + x[i][k] * y[k][j];
                }

                z[i][j] = sum;
            }
        }

        // Print Result Matrix
        System.out.println("\nResult Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(z[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows of first matrix: ");
        int r1 = sc.nextInt();

        System.out.print("Enter columns of first matrix: ");
        int c1 = sc.nextInt();

        System.out.print("Enter rows of second matrix: ");
        int r2 = sc.nextInt();

        System.out.print("Enter columns of second matrix: ");
        int c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }

        int x[][] = new int[r1][c1];
        int y[][] = new int[r2][c2];

        // Input First Matrix
        System.out.println("Enter First Matrix Elements:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                x[i][j] = sc.nextInt();
            }
        }

        // Input Second Matrix
        System.out.println("Enter Second Matrix Elements:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                y[i][j] = sc.nextInt();
            }
        }

        // Print First Matrix
        System.out.println("\nFirst Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }

        // Print Second Matrix
        System.out.println("\nSecond Matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(y[i][j] + "\t");
            }
            System.out.println();
        }

        MatrixMul obj = new MatrixMul();
        obj.matrixmult(x, y, r1, c1, r2, c2);

        sc.close();
    }
}