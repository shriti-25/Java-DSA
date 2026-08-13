class  Pattern2
{
public static void main(String...  s) throws java.io.IOException
{
int i, j, rows;
System.out.printf("Enter the number of rows");

rows = new java.util.Scanner(System.in).nextInt();

for(i = 1; i<=rows; ++i)
{
for(j = 1; j<=i; j++)
{
System.out.printf("*");
}
System.out.printf("\n");
}
}
}