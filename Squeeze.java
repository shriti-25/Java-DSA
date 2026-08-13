import java.util.Scanner;

class Squeeze
{
static String squeeze(String s)
{
String str = "";
for(int i = 0; i < s.length(); i++)
{
if(s.charAt(i) != ' ')
{
str = str + s.charAt(i);
}
}
return str;
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string:");
String s = sc.nextLine();
System.out.println("After Squeeze: " + squeeze(s));
}
}