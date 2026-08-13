class Assignment8
{
public static void main(String... s)throws java.io.IOException
{
int i,  j, rows ;
char alphabet;
System.out.println("Enter the number of rows");
rows = new java.util.Scanner(System.in).nextInt();

for(i=1; i<=rows; i++)
{
alphabet='A';
for(j=1; j<=rows; j++)
{
System.out.print(alphabet);
alphabet++;
}
System.out.println("\n");
}
}
}



