import java.util.Scanner;

class VowelCount
{
static int vowelCount(String s)
{
int count = 0;
for(int i = 0; i < s.length(); i++)
{
char ch = s.charAt(i);

if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' 
||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
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
System.out.println("Vowel Count: " + vowelCount(s));

}
}