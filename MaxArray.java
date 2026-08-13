/*import java.util.Scanner;

class MaxArray
{
    static int max;   

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[ ] = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        max = arr[0];   

        for(int i = 1; i < n; i++)
        {
            if(arr[i] > max)
            {
                max  = arr[i];
            }
        }

        System.out.println("Maximum element = " + max);
    }
}*/
 

import  java.util.Scanner;
class MaxArray
{
 static int max ;
public static void main(String [ ] args)
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter the size of array :");
int n = sc.nextInt();

int arr[ ] = new int [n];

System.out.println(" Enter the element in the array :");
for( int i=0 ;i< n; i++)
{
arr[ i ] = sc.nextInt();
}

max = arr[0] ;

for(int i =1; i<n; i++)
{
if( arr[i] >max)

{
max= arr[i];
}
}
 System.out.println(" Maximum number is =" + max);
}
}













































