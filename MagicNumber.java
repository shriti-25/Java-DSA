/* A Magic Number is a number whose sum of digits is repeatedly calculated until a single digit is obtained, and that single digit is 1.

Steps
Find the sum of the digits.
If the sum has more than one digit, again find the sum of its digits.
Repeat until you get a single digit.
If the final single digit is 1, then it is a Magic Number; otherwise, it is not.
Example 1: 1729
1 + 7 + 2 + 9 = 19
1 + 9 = 10
1 + 0 = 1 

Output: 1729 is a Magic Number.  

*/



import java.util.Scanner ;
class MagicNumber
{
public static void main (String args [ ])
{
Scanner  in = new Scanner(System.in);
System.out.println("Enter any number you want to check");

int n = in.nextInt();

int r = 0 ;
int sum = 0;
while(true)
{
while(n>0)
{
r = n% 10;
sum = sum + r ;
n= n/10;
}

if(sum == 1)
{
System.out.println("yes , it is a magic number");
break;
}
else if(sum> 1&& sum<=9)
{
System.out.println("no , it is not a magic number");
break;
}
else
{
n = sum;
sum =0;
continue;
}
}
}
}

















