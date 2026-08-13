class Assignment43
{
public static void main(String args[ ]) throws java.io.IOException
{
int i , j , rows;

System.out.println(" Enter the number of rows ");
rows = new java.util.Scanner(System.in).nextInt();

for(i=1 ;  i<=rows;  i++)
{
for(j=rows ;  j>=i;  j--)
{
System.out.print(j);
}
System.out.println( );
}
}
}

