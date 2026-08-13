class Assignment32
{
public static void main(String args[ ]) throws java.io.IOException
{
int i, j, rows;

System.out.print("Enter the rows");
rows = new java.util.Scanner(System.in).nextInt();

for(i =1; i<=rows; i++)
{
for(j=1; j<=i; j++)
{
if( j% 2== 0)
{
System.out.print(0);
}
else
{
System.out.print(1);
}
}
System.out.println();
}
}
}