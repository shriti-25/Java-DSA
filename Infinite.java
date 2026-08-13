class Infinite
{
public static void main(String... s)
{

double number, sum = 0.0 ;
 while(true)
{
System.out.println("Enter the number");
number = new java.util.Scanner(System.in).nextInt();

if(number<0.0)
{ 
break;
}
sum += number;
}
System.out.println("the sum of number are =" + sum);
}
}
