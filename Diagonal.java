import java.util.Scanner;

class Diagonal
{
static void printdiagonalwise(int x[ ][ ])
{
for(int k = 0; k < 9; k++)
{
for(int i = 0; i < 5; i++)
{
int j = k - i;

if(j >= 0 && j < 5)
System.out.print(x[i][j] + " ");
}

System.out.println();
}
}

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

int x[][] = new int[5][5];

System.out.println("Enter 25 elements:");

for(int i = 0; i < 5; i++)
{
for(int j = 0; j < 5; j++)
{
x[i][j] = sc.nextInt();
}
}

System.out.println("Your Matrix is:");

for(int i = 0; i < 5; i++)
{
for(int j = 0; j < 5; j++)
{
System.out.print(x[i][j] + " ");
}
System.out.println();
}


System.out.println("Diagonal wise:");

printdiagonalwise(x);
}
}