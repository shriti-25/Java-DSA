class Assignment40
{
public static void main(String args[ ]) throws java.io.IOException
{
int i , j , rows;
System.out.println(" Enter the number of rows ");
rows = new java.util.Scanner(System.in).nextInt();

for(i=1 ;  i<=rows;  i++)
{
for(j=1 ;  j<=rows;  j++)
{
if(i == 1) 
{
System.out.print( j + "   ");
}
else if ( i == rows)
{
System.out.print( (rows -j +1) + "   ");
}
else if ( j == 1)
{
System.out.print( i + "   ");
}
else if ( j == rows)
{
System.out.print( (rows - i +1) + "   ");
}
else 
{
System.out.print("    ");
}
}
System.out.println( );
}
}
}




