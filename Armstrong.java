/* class Armstrong
{
public static void main(String[ ] args)
{
int rev= 0;
int z;
int x2 ;
 while(true)
{
System.out.println("Enter the value1");
x2 = new java.util.Scanner(System.in).nextInt();

int x1 = x2;
 
while(x1>0)
{
z =x1%10;
x1=x1/10;
rev= rev+(z*z*z);
}

if(rev == x2)
System.out.println("it is a Armstrong number");
else
System.out.println("it is  not a  Armstrong number");

System.out.println("do you want to continue press 1 for yes 0 for no");
int x3 = new java.util.Scanner(System.in).nextInt();
 if(x3==1)
continue;
else
break;
}
}
}
*/

/* class Armstrong 
{
public static void main (String[ ] args)
{

int rev =0;
int z; 
int x2 ;
 
while(true)
{
System.out.println(" Enter the numbers ");
 x2 = new java.util.Scanner(System.in).nextInt();

int x1 = x2;

while( x1> 0 )
{
z= x1 % 10;
 x1 = x1 / 10 ;
rev = rev +( z*z*z ) ;
}

if( rev == x2)
System.out.println("Number is Armstrong");
else
System.out.println("Number is not Armstrong");

System.out.println("Do you want to continue press 1 for yes and 0 for no ");
int x3 = new java.util.Scanner(System.in).nextInt();
if( x3 == 1)
continue;
else 
break;

}
}
}
*/
 
class Armstrong 
{
public static void main (String[ ] args)
{

while(true)
{
System.out.println(" Enter the numbers ");
 int x2 = new java.util.Scanner(System.in).nextInt();

int x1 = x2;
int temp = x2;
int z=0; 
int digit =0;
int rev =0;

while(temp>0)
{
temp= temp/10;
digit++;
}

while( x1> 0 )
{
z= x1 % 10;
x1 = x1 / 10 ;
rev = rev +(int)Math.pow( z,digit ) ;
}

if( rev == x2)
System.out.println("Number is Armstrong");
else
System.out.println("Number is not Armstrong");

System.out.println("Do you want to continue press 1 for yes and 0 for no ");
int x3 = new java.util.Scanner(System.in).nextInt();
if( x3 == 1)
continue;
else 
break;

}
}
}





























 