class Pattern5
{
public static void main(String... s)throws java.io.IOException
{
int i,  j, rows ;

System.out.println("Enter the number of rows");
rows = new java.util.Scanner(System.in).nextInt();

for(i=rows; i>=1; i--)
{
for(j=1; j<=i; j++)
{
System.out.print(j);
}
System.out.println("\n");
}
}
}