import java.util.Scanner;

class PrintTriangleWise 
{
public static void main(String args[ ])
{
Scanner sc = new Scanner(System.in);

int x[ ] = new int[5];

System.out.println("Enter 5 numbers:");

for(int i = 0; i < 5; i++)
{
x[i] = sc.nextInt();
}

for(int i = 0; i < x.length; i++)
{
for(int j = 0; j <= i; j++)
{
System.out.print(x[j]);
}

System.out.println();
}
}
}