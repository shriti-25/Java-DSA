class Assignment52
{
public static void main(String args[ ]) throws java.io.IOException
{
int i , j , rows;
char ch ;
System.out.println(" Enter the number of rows ");
rows = new java.util.Scanner(System.in).nextInt();

 for(i=1 ;  i<=rows;  i++)
{
ch= (char)('A' + i -1) ;
for(j=1 ;  j<=rows-i+1 ;  j++)
{
System.out.print(ch);
}
System.out.println( );
}
}
}







