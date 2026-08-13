class Assignment28
{
public static void main(String args[ ]) throws java.io.IOException
{
int i , j , rows;

System.out.println("Enter the number of rows");
rows = new java.util.Scanner(System.in).nextInt();

for(i=1;  i<=rows;  i++)
{
for(j=i;  j>=i;  j++)
{
System.out.print(i);
}
System.out.println();
}
}
}



