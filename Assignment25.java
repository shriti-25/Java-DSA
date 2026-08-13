class Assignment25
{
public static void main(String args[ ]) throws java.io.IOException
{
int i , j,rows ;

int num=1;

System.out.println("Enter the number of rows");
rows = new java.util.Scanner(System.in).nextInt();

for(i=1;  i<=rows;  i++)
{
int temp = num ;
for(j=1;  j<=i ;  j++)
{
System.out.print(temp);
temp--;
} 
num = num + 2;
System.out.println();
}
}
}





