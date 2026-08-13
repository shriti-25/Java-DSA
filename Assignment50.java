class Assignment50
{
public static void main(String args[ ]) throws java.io.IOException
{
int i , j , rows;
char ch ;
System.out.println(" Enter the number of rows ");
rows = new java.util.Scanner(System.in).nextInt();

 for(i=0 ;  i<rows;  i++)
{
for(j=i ;  j<rows;  j++)
{
System.out.print((char)('A'+j));
}
System.out.println( );
}
}
}







