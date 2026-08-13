import java.util.Scanner;

/*class MinArray
{
    static int min;   

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int arr[ ] = new int [n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        min = arr[0];   

        for(int i = 1; i < n; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }

        System.out.println("Minimum element = " + min);
    }
}*/

import java.util.Scanner ;
class MinArray
{
static int min;

public static void main(String [ ]args)
{

Scanner sc= new Scanner(System.in);

System.out.print(" Enter the size of the array :");
int n = sc.nextInt();

int arr [ ] = new int [ n];

System.out.println("Enter the element in the array :");
for( int i = 0 ; i< n; i++)
{ 
arr[i]= sc.nextInt();
}

min = arr[0]  ;

for( int i= 1 ; i< n ; i++)
{
if(arr[i] < min)
{
min = arr[ i ];
}
}
System.out.print("Minimun number = " + min);
}
}



























