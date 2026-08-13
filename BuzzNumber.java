/* A number is a buzz number if its ends with 7 or its divisible by 7. 63 is a buzz number as it is a divisible by 7. 747 is also abuzz number as it end with 7  */



import  java.util.Scanner ;
public class BuzzNumber
{
public static void main(String args[ ])
{
int n;
Scanner in = new Scanner(System.in);
System.out.println("Enter any number to check whether its a bizz number or not");

n= in.nextInt();
if(n% 10 == 7 ||  n%7 == 0)
{
System.out.println("yes , " +n+" its a buzz number");
}
else
{
System.out.println("no , " +n+" its not a buzz number");
}
}
}