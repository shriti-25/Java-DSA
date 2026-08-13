import java.util.Scanner;

public class MatrixSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 4x4 Array
        int[ ][ ] a = new int[4][4];

        System.out.println("Enter 3x3 Matrix Elements:");

        // Input
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int mainDiagonal = 0;
        int secondDiagonal = 0;

        // Row Sum + Diagonal Sum
        for (int i = 0; i < 3; i++) {

            int rowSum = 0;

            for (int j = 0; j < 3; j++) {

                rowSum += a[i][j];

                if (i == j)
                    mainDiagonal += a[i][j];

                if (i + j == 2)
                    secondDiagonal += a[i][j];
            }

            a[i][3] = rowSum;   // Last column = Row Sum
        }

        // Column Sum
        int[] colSum = new int[3];

        for (int j = 0; j < 3; j++) {

            for (int i = 0; i < 3; i++) {
                colSum[j] += a[i][j];
            }
        }

        // Final Output
        System.out.println("\nFinal Output:");

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 5; j++) {

                if (i < 3) { // First 3 rows

                    if (j == 0)
                        System.out.print("\t"); // Blank column

                    else if (j <= 3)
                        System.out.print(a[i][j - 1] + "\t");

                    else
                        System.out.print(a[i][3] + "\t"); // Row Sum
                }

                else { // Last row

                    if (j == 0)
                        System.out.print(secondDiagonal + "\t");

                    else if (j <= 3)
                        System.out.print(colSum[j - 1] + "\t");

                    else
                        System.out.print(mainDiagonal + "\t");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}