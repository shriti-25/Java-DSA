import java.util.Scanner;

public class UpperTriangle {

    public static void main(String[ ] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int a[ ][ ]  = new int[n][n];

        System.out.println("Enter Matrix Elements:");

        // Input Matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Print Original Matrix
        System.out.println("\nOriginal Matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }

        int sum = 0;
        int max = a[0][0];
        int min = a[0][0];

        // Print Upper Triangle
        System.out.println("\nUpper Triangle Matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (j >= i) {
                    System.out.print(a[i][j] + "  ");

                    sum += a[i][j];

                    if (a[i][j] > max)
                        max = a[i][j];

                    if (a[i][j] < min)
                        min = a[i][j];
                } else {
                    System.out.print("  "); // Lower triangle ki jagah blank
                }
            }
            System.out.println();
        }

        System.out.println("\nSum = " + sum);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}