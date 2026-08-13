import java.util.Scanner;
class Median
{
static float findMedian(int  z[ ])
{
 for(int i =0; i <z.length - 1; i++)
{
for(int j =0; j <z.length - 1-i ; j++)
{
  if(z[j] > z[j+1])
{
        int temp = z[j] ;
        z[j] = z[j+1];
        z[j+1] = temp;

}
}
}

int n = z.length ;

if(n % 2 != 0)
{
return z[n/2];
}


else
{
return (float)(z[n/2 -1] + z[n/2]) /2 ;
}
}


public static void main(String args[ ])
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter size of array:");
int n = sc.nextInt();

int z[ ] = new int[n];

System.out.println("Enter array values:");

for(int i = 0; i < n; i++)
{
z[i] = sc.nextInt();
}

System.out.println("Median  =  "  +  findMedian(z));
}
}