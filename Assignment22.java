class Assignment22
{
public static void main(String args[ ]) throws java.io.IOException
{
int i , j , rows;
System.out.println("Enter the number of rows");
rows = new java.util.Scanner(System.in).nextInt();

for(i=0;  i<rows;  i++)
{
char Alphabet1='A';

for(j=1; j<rows; j++)
{
if( i % 2 ==0)
{
System.out.print(Alphabet1);
Alphabet1++;
}
else
{
System.out.print(j);
}
}
System.out.println();
}
}
}




