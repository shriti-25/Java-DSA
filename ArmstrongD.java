class ArmstrongD 
{
 public static void main(String[ ] args)
{
while(true)
{
System.out.println("Enter the value of x2");
int x2 = new java.util.Scanner(System.in).nextInt();
 
int x1 = x2 ;
int temp =x2;
int z=0;
int digit =0;
int rev=0;


while(temp > 0)
{
digit++ ;
temp = temp /10;
}

while(x1 > 0)
{
z = x1 % 10 ;
x1 = x1 / 10 ;
rev = rev + (int)Math.pow(z,digit);
}

if(rev == x2)
System.out.println("Armstrong number");
else
System.out.println("Not a Armstrong number");

System.out.println("press 1 for yes and 0 for no");
int x3 = new java.util.Scanner(System.in).nextInt();

if(x3 == 1)
continue;
else 
break;

}
}
}

