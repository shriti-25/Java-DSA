class Main10
{
public static void main(String args [ ])
{
int i, j,rows;

System.out.println("Enter the number of rows");
rows = new java.util.Scanner(System.in).nextInt();

for(i=1; i<=rows; i++)
{
for(j=1; j<=i; j++)
{
System.out.print("A");
}
System.out.println( );
}
}
}