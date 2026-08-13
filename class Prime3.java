class Prime3
{
public static void main(String[ ] args)
{

System.out.println("Enter the number");
x= new java.util.Scanner.(System.in).nextInt();

int count =0;
for( int i=1; i<=x; i++)
{
int z = x % i;
if(z == 0)
{
count++;
}
if(count == 2)
System.out.println("number is prime ");
else
System.out.println("number is not prime ");
}

}
}

