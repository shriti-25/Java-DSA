/*3 4 7
7 5 12
12 6 18
18 7 25
25 8 33
33 9 42
42 10 52
52 11 63*/

public class PatternNumberSequence
{
public static void main(String args[ ])
{
int a = 3;
int b= 4;
int n=8;

for(int i = 1; i<= n; i++)
{
int c= a+b;
System.out.print(a +" " + b+ " "+ c );
System.out.println();
a =c;
b=b+1;
}
}
}