class Fibonacci
{
public static void main(String...  s) throws java.io.IOException
{
int i, n;
int  t1 =0, t2= 1;
int nextTerm = t1+ t2;
System.out.print("Enter the number of term :");
n = new java.util.Scanner(System.in).nextInt();

System.out.printf("Fibonacci series : %d, %d ,",t1, t2);

for( i=3; i<= n; ++i)
{
System.out.printf("%d, ", nextTerm);
t1 =t2;
t2 = nextTerm;
nextTerm = t1 +t2;


}
}
}
