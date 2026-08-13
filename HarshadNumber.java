/*  An integer number in base 10 which is divisible by the sum of its digits is said to be a Harshad Number. An n-Harshad number is an integer number divisible by the sum of its digit in base n.
Below are the first few Harshad Numbers represented in base 10:
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 18, 20.........
Given a number in base 10, our task is to check if it is a Harshad Number or not.

Examples : 

Input: 3
Output: 3 is a Harshad Number

Input: 18
Output: 18 is a Harshad Number

Input: 15
Output: 15 is not a Harshad Number  */


import java.util.Scanner;

public class HarshadNumber
{
public static void main(String args [ ])
{
int n ,r , s = 0;
Scanner  in = new Scanner(System.in);
System.out.println("Enter any number");

n = in.nextInt();
int temp =n;

while(n>0)
{
r = n%10;
s =s +r ;
n = n/10;
}

if(temp % s == 0)
{
System.out.println("yes it is harshad number");
}
else
{
System.out.println("no it is not harshad number");
}
}
}

















