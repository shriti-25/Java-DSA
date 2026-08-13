class CheckVowel1
{
public static void main(String args[])throws java.io.IOException
{
System.out.println("Enter the character");

int x= System.in.read();

char ch=(char)x;

if(ch=='A' || ch=='a' ||ch=='E' ||ch=='I' || ch=='i' ||ch =='O' ||ch=='o' || ch=='U' || ch=='u')

 else
System.out.println("not vowel");
}
}