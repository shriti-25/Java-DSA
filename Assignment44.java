class Assignment44
{
public static void main(String args[ ]) throws java.io.IOException
{
int i , j , rows;

System.out.println(" Enter the number of rows ");
rows = new java.util.Scanner(System.in).nextInt();

for(i=1 ;  i<=rows;  i++)
{
for(j=1 ;  j<=rows-i+1;  j++)
{
System.out.print(j);
}
System.out.println( );
}
}
}

