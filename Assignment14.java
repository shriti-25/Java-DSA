class Assignment14
{
public static void main(String... s) throws java.io.IOException
{
int i, j,rows;

System.out.println("Enter the number of rows");
rows = new java.util.Scanner(System.in).nextInt();

for(i=1; i<=rows; i++)
{
for(j=1; j<=rows; j++)
{ 

if ( (i % 2 == 0  && j %2 == 0) || ( i % 2 != 0 &&  j% 2 !=0) )
{
System.out.print("1");
}
else 
{
System.out.print("0");
}
}
System.out.println("\n");
}
}
}