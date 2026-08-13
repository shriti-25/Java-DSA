class Assignment34
{
public static void main(String args[ ]) throws java.io.IOException
{
int i , j , rows;
System.out.println("Enter the number of rows");
rows = new java.util.Scanner(System.in).nextInt();

for(i=0;  i<rows;  i++)
{
char Alphabet =(char)( 'A' +i );
for(j=0; j<=i; j++)
{
System.out.print(Alphabet);
Alphabet++;
}
System.out.println();
}
}
}





