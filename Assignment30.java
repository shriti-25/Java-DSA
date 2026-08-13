class Assignment30
{
public static void main(String args[ ]) throws java.io.IOException
{
int i , j,rows ;

char Alphabet = 'A';

System.out.println("Enter the number of rows");
rows = new java.util.Scanner(System.in).nextInt();

for(i=1;  i<=rows;  i++)
{
char temp = Alphabet ;
for(j=1;  j<=i ;  j++)
{
System.out.print(temp);
temp--; 
}
Alphabet = (char)(Alphabet + 2);
System.out.println();
}
}
}



