class even2
{
public static void main(String args[])
{
System.out.println("Enter the number");
 int no = new java.util.Scanner(System.in).nextInt();
 
if(no%2==0)
System.out.println("Number is even =" + no);
else
System.out.println("Number is odd="+no);
}
}