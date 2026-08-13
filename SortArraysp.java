import java.util.Scanner;
class SortArraysp
{
 public static void main(String arg[ ])
{
Scanner sc= new Scanner(System.in);

System.out.println("enter the elements in rows");
int r = sc.nextInt();


System.out.println("enter the elements in cols");
int c = sc.nextInt();

int arr[ ][ ] = new int[r][c];


System.out.println("Enter the elements");
for(int i= 0; i<r; i++)
{ 
for(int j= 0; j<c; j++)
{
arr[i][j] =sc.nextInt();
}
}

for(int i= 0; i<r; i++)
{
for(int j= 0; j<c; j++)
{
for(int k= 0; k<r; k++)
{
for(int l= 0; l<c; l++)
{

 if(arr[i][j]<arr[k][l])
 {
 int temp = arr[i][j];
arr[i][j] = arr[k][l];
arr[k][l] = temp;
}
}
}
}
}

System.out.println("Ascending order");
for(int i= 0; i<r; i++)
{
for(int j= 0; j<c; j++)
{
System.out.print(arr[i][j] + "\t") ;
}
System.out.println();
}
}
}












