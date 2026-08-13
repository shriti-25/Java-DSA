class Break
{
public static void main(String... s)throws java.io.IOException
{

double number,sum = 0.0;
for(int i =1; i<=10; ++i)
{
System.out.printf("Enter the number %d: " ,i);
number = new java.util.Scanner(System.in).nextInt();

if(number<0.0)
{
break;
}
sum+= number;
}
System.out.println("The sum of the numbers are=" + sum);

}



}