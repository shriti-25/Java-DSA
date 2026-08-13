import java.util.Scanner;
class Mean
{
static float findMean(int  z[ ])
{
int sum =0;
for(int i =0; i < z.length; i++)
{
sum = sum + z[i] ;
}
return (float) sum / z.length ;
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

System.out.println("Mean  = "  +  findMean(z));
}
}