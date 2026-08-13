class Assignment7
{
public static void main(String... s) throws java.io.IOException
{
int i, j , rows;
int n=1;
System.out.println("Enter the number of rows");
rows = new java.util.Scanner(System.in).nextInt();

for( i= 1; i<=rows; i++)
{
n=i;
for(j=1 ; j<=rows; j++)
{
System.out.print(n);
n++;
}
System.out.print("\n");

}
}
}

