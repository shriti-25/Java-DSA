class Assignment31
{
public static void main(String args [ ]) throws java.io.IOException
{
 int i , j ,rows;

System.out.println("Enter the number of rows");
rows = new java.util.Scanner(System.in).nextInt();

for(i=1; i<=rows; i++)
{
for(j =1; j<= i ; j++)
{
if(i  % 2== 1)
{
System.out.print("*");
}
else
{
System.out.print(j);
}
}
System.out.println( );
}
}
}

