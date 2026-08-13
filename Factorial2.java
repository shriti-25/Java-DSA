class Factorial2
{
public static void main(String[ ] args) throws java.io.IOException
{
int n, i;
int fact =1 ;

System.out.println("Enter the number ");
n = new java.util.Scanner(System.in).nextInt() ;

if(n<=0)
System.out.println("Factorial does not exist");
else
for( i= 1; i<=n; i++)
{
fact= fact*i ;
}
System.out.println("The factorial of "+ n  + "  is " +  fact );
}
}
