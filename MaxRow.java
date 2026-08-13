import java.util.Scanner;

class MaxRow
{
static void maxInOneRow(int x[ ][ ])
{
int maxSum = -1;

for(int i = 0; i < 5; i++)
{
int sum = 0;

for(int j = 0; j < 5; j++)
{
sum = sum + x[i][j];
}

if(sum > maxSum)
{
maxSum = sum;
}
}

System.out.println("Maximum Sum = " + maxSum);
}

public static void main(String args[ ])
{
Scanner sc = new Scanner(System.in);

int x[ ][ ] = new int[5][5];

System.out.println("Enter only 0 and 1:");

for(int i = 0; i < 5; i++)
{
for(int j = 0; j < 5; j++)
{
x[i][j] = sc.nextInt();

if(x[i][j] != 0 && x[i][j] != 1)
{
System.out.println("Only 0 and 1 allowed");
return ;
}
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



maxInOneRow(x);
}
}