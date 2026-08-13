import java.util.Scanner;

class BinaryToDecimal
{
static int binaryToDecimal(int x [ ])
{
int decimal = 0;

for(int  i= 0; i<x.length; i++)
{
decimal = decimal *2 +x[i];
}
return decimal;
}
public static void main(String args[ ])
{
Scanner sc = new Scanner(System.in);
 
System.out.println("Enter the size of the array");
int n = sc.nextInt();

int x[ ] =  new int[ n];

System.out.println("Enter the binary Element");
for(int  i=0; i<n; i++)
{
x[ i ] = sc.nextInt();
}
System.out.println("Decimal = " + binaryToDecimal(x));
}
}