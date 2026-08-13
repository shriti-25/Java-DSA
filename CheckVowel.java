class CheckVowel
{
public static void main(String s[]) throws java.io.IOException
{
System.out.println("Enter the character");

int x= System.in.read();

 char ch = (char)x ;
if(ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o'  || ch=='U' || ch=='u')
System.out.println("Vowel");
else

System.out.println("not vowel");
}
}



