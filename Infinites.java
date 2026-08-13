class Infinites
{
public static void main(String... s)
{
 int i=1;
double number, sum = 0.0 ;

 do
{
System.out.println("Enter the number");
number = new java.util.Scanner(System.in).nextInt();

if(number<0.0)
{ 
break;
}
sum += number;
}while(true);

System.out.println("the sum of number are =" + sum);
}

}