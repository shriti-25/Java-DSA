class Infinite2 
{
public static void main(String... s)
{
int i=1;
double number, sum=0.0;
for(; ;)
{
System.out.println("Enter the number");
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
