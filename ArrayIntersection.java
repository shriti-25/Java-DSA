import java.util.Scanner;

class ArrayIntersection {

    void intersection(int x[ ], int y[ ], int n, int m) {

        System.out.print("Intersection: ");

        for (int i = 0; i < n; i++) {

            int j;

            // Second array me search
            for (j = 0; j < m; j++) {
                if (x[i] == y[j]) {
                    break;
                }
            }

            // Agar second array me mil gaya
            if (j < m) {

                int k;

                // First array ke previous elements me duplicate check
                for (k = 0; k < i; k++) {
                    if (x[i] == x[k]) {
                        break;
                    }
                }

                // Agar duplicate nahi hai
                if (k == i) {
                    System.out.print(x[i] + " ");
                }
            }
        }
    }

    public static void main(String args[ ]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();

        int x[ ] = new int[n];
        int y[ ] = new int[m];

        System.out.println("Enter first array elements:");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        System.out.println("Enter second array elements:");
        for (int i = 0; i < m; i++) {
            y[i] = sc.nextInt();
        }

        ArrayIntersection obj = new ArrayIntersection();
        obj.intersection(x, y, n, m);

        sc.close();
    }
}