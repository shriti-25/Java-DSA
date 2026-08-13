import java.util.Scanner;

class ArrayUnion {

    void union(int x[ ], int y[ ], int n, int m) {

        System.out.print("Union: ");

        // First array print (duplicate remove karke)
        for (int i = 0; i < n; i++) {

        for (int j = 0; j < i; j++) {
                if (x[i] == x[j]) {
                    break;
                }
            }


            if (j == i) {
                System.out.print(x[i] + " ");
            }
        }

        // Second array ke unique elements print
        for (int i = 0; i < m; i++) {

            int j;

            // Check first array
            for (j = 0; j < n; j++) {
                if (y[i] == x[j]) {
                    break;
                }
            }

            // Agar first array me nahi hai
            if (j == n) {

                int k;

                // Check second array ke previous elements
                for (k = 0; k < i; k++) {
                    if (y[i] == y[k]) {
                        break;
                    }
                }

                // Agar duplicate nahi hai
                if (k == i) {
                    System.out.print(y[i] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();

        int x[] = new int[n];
        int y[] = new int[m];

        System.out.println("Enter first array elements:");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        System.out.println("Enter second array elements:");
        for (int i = 0; i < m; i++) {
            y[i] = sc.nextInt();
        }

        ArrayUnion obj = new ArrayUnion();
        obj.union(x, y, n, m);

        sc.close();
    }
}