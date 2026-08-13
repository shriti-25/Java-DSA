import java.util.Scanner;

class WordCount
{
static int wordCount(String s) 
{
String[ ] a = s.split(" ");
return a.length;
}

public static void main(String[ ] args) {
Scanner sc = new Scanner(System.in);
System.out.println(" Enter a string ");
String s = sc.nextLine();
System.out.println("Word Count: " + wordCount(s));

}
}


/*
import java.util.Scanner;
class WordCount
{
static int wordCount(String s)
{
int count = 0;
for(int i = 0; i < s.length(); i++)

if(s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' '))
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
System.out.println("Word Count: " + wordCount(s));

}
}

*/