class PatternA
{
public static void main(String[ ] args)
{
 int i, j ,rows ;

System.out.println("Enter the number of rows :");
rows = new java.util.Scanner(System.in).nextInt();

for( i = rows; i>= 1; i--)
{
for(  j=1 ; j<= i ; j++)
{
System.out.print( j );
}
System.out.println("  ");
}
}
}