import java.util.Scanner;
class RightTrim
{
static String RightTrim(String s)
{
 int i = s.length() - 1;
while(i >= 0 && s.charAt(i) == ' ')
{
i--;
}
return s.substring(0, i + 1);
}
public static void main(String[ ] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string:");
String s = sc.nextLine();
System.out.println("After Right Trim: " + RightTrim(s));
}
}