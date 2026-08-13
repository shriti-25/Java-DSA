class Fibonacci2
{
public static void main(String [ ] args) throws java.io.IOException
{
int i , n , c;
int t1 =0, t2 =1;

System.out.print("Enter the number of terms : ");
n = new java.util.Scanner(System.in).nextInt();

System.out.print(" The Fibonacci series is : ");

for( i =1 ; i <=n ; i++)
{
System.out.print( t1 + "  " );
c = t1 + t2 ;
t1 = t2 ;
t2 = c;
}
}
}

/*class Fibonacci 
{ 
public static void main(String [ ] args)
{
 int n,c, t1 = 0, t1=1;
 
System.out.println("Enter the number of terms");
n= new java.util.Scanner(System.in).nextInt();

for(i = 1; i<=n ; i++)
{
System.out.println(" The fibonacci series of " + n + " is" + t1);
{
c= t1 + t2;
t1= t2;
t2 = c;
}
}
}
}*/
 




























 