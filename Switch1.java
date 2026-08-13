class Switch1
{
public static void main(String[] args)
{
System.out.println("Enter the number");
int num = new java.util.Scanner(System.in).nextInt();


switch(num)
{
case 1: 
System.out .printf("Sunday");
break;

case 2:
System.out.printf("Monday");
break;

case 3:
System.out.printf("Tuesday");
break;

default :
System.out.printf("Holiday");

}
}
}