class Assignment13
{
public static void main(String... s) throws java.io.IOException
{
int i, j , p, rows;

System.out.println("Enter the number of rows");
rows = new java.util.Scanner(System.in).nextInt();

System.out.println("Enter the number ");
int n = new java.util.Scanner(System.in).nextInt();


for( i= 1; i<=rows ; i++)
{
p=n+i-1;
for(j=1 ; j<=rows ; j++)
{
System.out.print( p + "  ");
p--;
}
System.out.print("\n");

}
}
}
