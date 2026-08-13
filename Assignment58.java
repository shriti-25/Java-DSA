class Assignment58
{
public static void main(String args[ ]) throws java.io.IOException
{
int i , j , rows;

System.out.println(" Enter the number of rows ");
rows = new java.util.Scanner(System.in).nextInt();

 for(i=1 ;  i<=rows;  i++)
{
for(j=i ;  j<=rows;  j++)
{
if(j % 2 == 0)
{
System.out.print(0);
}
else
{
System.out.print(1);
}
}
System.out.println( );
}
}
}







