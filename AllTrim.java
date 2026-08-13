import java.util.Scanner;
class AllTrim
{
static String allTrim(String s)
{
 int start = 0;
 int end = s.length() - 1;
 while(start < s.length() && s.charAt(start) == ' ')
{
start++;
}
while(end >= 0 && s.charAt(end) == ' ')
{
end--;
}
return s.substring(start, end + 1);
}
public static void main(String[ ] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string:");
String s = sc.nextLine();
System.out.println("After All Trim: " + allTrim(s));
}
}