class Assignment29
{
public static void main(String args[ ]) throws java.io.IOException
{
int i , j , rows;
System.out.println("Enter the number of rows");
rows = new java.util.Scanner(System.in).nextInt();

for(i=1;  i<=rows;  i++)
{
char Alphabet = 'A' ;
for(j=1; j<=i; j++)
{
System.out.print(Alphabet);
Alphabet++;
}
System.out.println();
}
}
}





