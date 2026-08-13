import java.util.Scanner;

public class MatrixTranspose2 {

    // Non-static method
    void matrixTranspose(int x[ ][ ], int r, int c ) {

        System.out.println("Original Matrix");

        for (int i = 0; i < r ; i++) {
            for (int j = 0; j < c ; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Transpose Matrix");

        for (int i = 0; i < c ; i++) {    // Columns
            for (int j = 0; j < r ; j++) {   // Rows
                System.out.print(x[j][i] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int arr[ ][ ]  = new int[r][c];

        System.out.println("Enter Matrix Elements:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Object create karke non-static method call
        MatrixTranspose2 obj = new MatrixTranspose2();
        obj.matrixTranspose(arr,r,c);

        sc.close();
    }
}