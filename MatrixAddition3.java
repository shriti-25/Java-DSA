import java.util.Scanner;

class MatrixAddition3 {

    public static void main(String[ ] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter Columns: ");
        int cols = sc.nextInt();

        int x[ ][ ]  = new int[rows][cols];
        int y[ ][ ]  = new int[rows][cols];

        System.out.println("Enter First Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                x[i][j] = sc.nextInt();
            }
        }

        System.out.println(" Enter Second Matrix ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                y[i][j] = sc.nextInt();
            }
        }

        System.out.println(" First Matrix ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(" Second Matrix ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(y[i][j] + " ");
            }
            System.out.println();
        }

   // Object create karke non-static method call
        MatrixAddition3 obj = new MatrixAddition3();
        obj.matrixAdd(x, y,rows,cols);
    }

   // Non-static method
    void matrixAdd( int x[ ][ ] , int y[ ][ ] ,int r ,int c) {

        System.out.println(" Addition of Matrix ");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print((x[i][j] + y[i][j]) + " ");
            }
            System.out.println();
        }
    }
}