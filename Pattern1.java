class Pattern1
{
public static void main(String...  s) throws java.io.IOException
{
int i , space, rows , k=0;
System.out .printf("Enter the number of rows");
rows =new java.util.Scanner(System.in).nextInt();

 for( i =1; i<=rows; ++i, k=0)
{
for(space =1 ; space <= rows -i ; ++space)
{
System.out.printf( " ");
}
while(k != 2* i -1)
{
System.out.printf("*");
++k;
}
System.out.printf("\n");
}
}
}

