import java.util.Scanner;
class StringPalindrome 
{
static boolean palindrome(String s) 
{
String rev = "";
for(int i = s.length() - 1; i >= 0; i--) 
{
 rev = rev + s.charAt(i);
 }
return s.equals(rev);
}
public static void main(String[ ] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string:");
String s = sc.nextLine();

System.out.println(palindrome(s));
 }
}