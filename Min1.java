import java.util.Scanner;

public class Min1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int a[ ][ ] = new int[r][c];

        System.out.println("Enter array elements:");

        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        // Minimum compare
        int min = a[0][0];

        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                if(a[i][j] < min)
                {
                    min = a[i][j];
                }
            }
        }

        System.out.println("Minimum Element = " + min);
    }
}