class IfElseLadder
{
public static void main(String[] s)
{
System.out .println("enter  the marks");
int marks = new java.util.Scanner(System.in).nextInt();
if(marks>75)
{
System.out .println("First Class");
}
 else if(marks >65)
{
System.out .println("Second class");
}
 else if(marks >55)
{
System.out .println("third class");
}
 else{
System.out .println("Fourth class");
}
}