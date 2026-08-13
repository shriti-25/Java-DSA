class Assignment24
{
public static void main(String args[ ]) throws java.io.IOException
{
int i , j , rows;
int n=1;
System.out.println("Enter the number of rows");
rows = new java.util.Scanner(System.in).nextInt();

for(i=1;  i<=rows;  i++)
{
n=i;
for(j=1;  j<=i ;  j++)
{
System.out.print(n);
n++;
}

System.out.println();
}
}
}




