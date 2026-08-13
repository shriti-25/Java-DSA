/* A composite number is a whole number greater than 1 that has more than two positive factors.

A prime number has exactly two factors: 1 and itself.
A composite number has more than two factors.
Examples of composite numbers:
4 → Factors: 1, 2, 4
6 → Factors: 1, 2, 3, 6
8 → Factors: 1, 2, 4, 8
9 → Factors: 1, 3, 9
10 → Factors: 1, 2, 5, 10 */


import java.util.Scanner ;
class CompositeNumber
{
public static void main (String args [ ])
{
Scanner  in = new Scanner(System.in);
System.out.println("Enter any number you want to check");

int n = in.nextInt();
int h = n/2 ;
int flag =0;
if(n<3)
{
System.out.println("No it is not composite number");
}
else
{
for(int i =2; i<= h; i++)
{
if(n % i == 0)
{
System.out.println("Yes it is  composite number");
flag =1;
break;
}
}
if(flag == 0)
{
System.out.println("No it is not composite number");
}
}
}
}










