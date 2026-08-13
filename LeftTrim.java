import java.util.Scanner;
class LeftTrim
{
 static String LeftTrim(String s)
{
int i = 0;
while(i < s.length() && s.charAt(i) == ' ')
{
 i++;
}
return s.substring(i);
}
public static void main(String[ ] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string:");
String s = sc.nextLine();
System.out.println("After Left Trim: " + LeftTrim(s));
}
}