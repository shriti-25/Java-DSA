class Assignment35
{
public static void main(String args[ ]) throws java.io.IOException
{
int i , j , rows;
System.out.println(" Enter the number of rows ");
rows = new java.util.Scanner(System.in).nextInt();

for(i=0 ;  i<=rows;  i++)
{
for(j=0 ;  j<=rows-i;  j++)
{
System.out.print("*");

}
System.out.println();
}
}
}




