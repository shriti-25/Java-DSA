class Assignment21
{
public static void main(String args[ ]) throws java.io.IOException
{
int i , j , rows;
System.out.println("Enter the number of rows");
rows = new java.util.Scanner(System.in).nextInt();

for(i=0;  i<rows;  i++)
{
char Alphabet1='A';
char Alphabet2='a';

for(j=0; j<rows; j++)
{
if( i % 2 ==0)
{
System.out.print(Alphabet1);
Alphabet1++;
}
else
{
System.out.print(Alphabet2);
Alphabet2++;
}
}
System.out.println();
}
}
}




