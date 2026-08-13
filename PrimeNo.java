class PrimeNo
{
public static void main(String[ ] args)
{
 System.out.println("Enter the value 1");
 int x1= new java.util.Scanner(System.in).nextInt(); 

int count=0;

for( int i =1; i<=x1; i++)
{
int z= x1%i;
 
if (z==0)
{ 
count++;
}
}
if(count== 2)
System.out.println("It is prime number"); 

 else
 System.out.println("It is not prime number"); 
}
}
