class AlphaPyramid
{
public static void main(String...  s) throws java.io.IOException
{
int i, j;
char input, alphabet ='A';
System.out.println(" Enter the uppercase character you want to print in the last row ");
int x = System.in.read();
input =(char)x;
for( i =1; i<=(input - 'A'+1) ;  ++i)
{
for(j=1; j<= i ; ++j)
{
System.out.print(  alphabet);
}
++alphabet;
System.out.printf("\n");
}
}
}








