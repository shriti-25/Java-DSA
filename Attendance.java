class Attendance
{
public static void main(String... s)
{
System.out.println("Number the classes held");
 int l= new java.util.Scanner(System.in).nextInt();

System.out.println("Number the classes attend");
 int b=  new java.util.Scanner(System.in).nextInt();
 
int p =(b*100)/l;

if(p>75)
System.out.println("Student is allowed seat in the exam=" +p);
else
System.out.println("Student is not allowed seat in the exam=" +p);
}
}



