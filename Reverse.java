class Reverse
{
public static  void main(String [ ] args)
{
int rev=0;
int z ;
int n;
while(true)
{
System.out.println("Enter the value1");
int x1 = new java.util.Scanner(System.in).nextInt();
 n = x1;
while(x1>0)
{
z=x1%10;
x1=x1/10;
rev=rev*10+z;
}
System.out.println(rev);
if(rev == n)
System.out.println("number is palindrome");
else
System.out.println("number is not palindrome");
rev=0;

 System.out.println("Do you want to continue press1 for yes and 0 for no");
 int x2 = new java.util.Scanner(System.in).nextInt();
if(x2==1)
continue;
else 
break;
}
}
}

