class Factorial
{
public static void main(String...  s) throws java.io.IOException
{
int n, i;
int fact =1; 
System.out.print("Enter the interger : ");
n = new java.util.Scanner(System.in).nextInt();
 
if( n<= 0)
System.out.println("Error ! factorial of a negative number does not exist");
else
{
for( i=1; i<=n; ++i)
{
fact = fact* i;
}
System.out.printf("Factorial of %d = %d", n, fact);
}
}
}