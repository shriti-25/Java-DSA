import java.util.Scanner;

class ArrayIntersection2 {

    void intersection(int x[ ], int y[ ], int m, int n) {

        System.out.print("Intersection: ");

        for (int i = 0; i < m; i++) {

            // Check x[i] second array me hai ya nahi
            int j;
            for (j = 0; j < n; j++) {
                if (x[i] == y[j]) {
                    break;
                }
            }

            // Agar mil gaya
            if (j < n) {

                // Duplicate check
                int k;
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
        int m = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int n = sc.nextInt();

        int x[ ] = new int[m];
        int y[ ] = new int[n];

        System.out.println("Enter first array elements:");
        for (int i = 0; i < m; i++) {
            x[i] = sc.nextInt();
        }

        System.out.println("Enter second array elements:");
        for (int i = 0; i < n; i++) {
            y[i] = sc.nextInt();
        }

        ArrayIntersection2 obj = new ArrayIntersection2();
        obj.intersection(x, y, m, n);

        sc.close();
    }
}