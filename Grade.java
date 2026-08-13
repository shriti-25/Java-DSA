class Grade
{
public static void main(String... s)
{
System.out.println("Enter the grade");
 int gd = new java.util.Scanner(System.in).nextInt();

if(gd<25)
{
System.out.println("Fail");
}
 else if( gd>=25 && gd <=45)
System.out.print(" E grade");

 else if( gd>=45 && gd <=50)
System.out.print(" D grade");


else if( gd>=50 && gd <=60)
System.out.print(" C grade");

else if( gd>=60 && gd <=80)
System.out.print(" B grade");

else if( gd>=80 && gd<=100)
System.out.print(" A grade");


else
System.out.print(" invalid marks");
}
}
