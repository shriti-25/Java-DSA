class Bonus
{
public static void main(String... s)
{
int bonus =0;
System.out.println("Enter the salary");
 int s1 = new java.util.Scanner(System.in).nextInt();

System.out.println("Enter the years of working");
 int y1 = new java.util.Scanner(System.in).nextInt();

if(y1>5)
{

  bonus =(s1*5)/100;
}

System.out.println("net bonus=" +bonus);

}
}
