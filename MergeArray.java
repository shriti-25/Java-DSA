//Merge Sorting
import java.util.Scanner;
class MergeArray
{
public static void main(String... s)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of first array:");
int n=sc.nextInt();

System.out.println("Enter size of second array:");
int m=sc.nextInt();

int x[]=new int[n];
int y[]=new int[m];
int z[]=new int[n+m];

System.out.println("Enter first array elements:");
for(int i=0;i<n;i++)
{
  x[i]=sc.nextInt();
}
System.out.println("Enter second array elements:");
for(int i=0;i<m;i++)
{
  y[i]=sc.nextInt();
}

//sort first array
for(int i=0;i<n-1;i++)
{
 for(int j=i+1;j<n;j++)
  {
     if(x[i]>x[j])
       {
          int temp=x[i];
          x[i]=x[j];
          x[j]=temp;
       }
  }
}
//sort second array
for(int i=0;i<m-1;i++)
{
 for(int j=i+1;j<m;j++)
  {
     if(y[i]>y[j])
       {
          int temp=y[i];
          y[i]=y[j];
          y[j]=temp;
       }
  }
}

//Merge both sorted arrays
int i=0,j=0,k=0;
while(i<n && j<m)
{
  if(x[i]<y[j])
   {
     z[k]=x[i];
     i++;
   }
   else
   {
     z[k]=y[j];
     j++;
   }
   k++;
}
  //Copy remaining elements of first array
while(i<n)
{
  z[k]=x[i];
  i++;
  k++;
}
//Copy remaining elements of second array
while(j<m)
{
  z[k]=y[j];
  j++;
  k++;
 }
System.out.println("Sorted First Array:");
for(i=0;i<n;i++)
{
System.out.print(x[i]+" ");
}
System.out.println();

System.out.println("Sorted Second Array:");
for(i=0;i<m;i++)
{
System.out.print(y[i]+" ");
}
System.out.println();


System.out.println("Merged Sorted Array:");
for(i=0;i<n+m;i++)
{
System.out.print(z[i]+" ");
}
}
}