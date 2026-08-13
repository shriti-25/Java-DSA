import java.util.Scanner;

class Sort2DArray
{
    public static void main(String args[ ])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int arr[ ][ ] = new int[r][c];

        System.out.println("Enter elements:");

        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        // Sorting
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                for(int k = 0; k < r; k++)      // compare wali row hai.
                {
                    for(int l = 0; l < c; l++)   // compare wala column hai
                    {
                        if(arr[i][j] < arr[k][l])
                        {
                            int temp = arr[i][j];
                            arr[i][j] = arr[k][l];
                            arr[k][l] = temp;
                        }
                    }
                }
            }
        }

        System.out.println("Ascending Order:");

        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}