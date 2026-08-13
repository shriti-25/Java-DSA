import java.util.Scanner;
class CharCount 
{
static int charCount(String s) 
{
 int count = 0;
for(int i = 0; i < s.length(); i++) 
{
if(s.charAt(i) != ' ')
 {
 count++;
}
}
return count;
}
public static void main(String[ ] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string:");
String s = sc.nextLine();
System.out.println(charCount(s));
 }
}