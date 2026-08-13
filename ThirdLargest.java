import java.util.Scanner;

class ThirdLargest
{
static int find3rdLargestValueInArray(int z[ ])
{
int first = Integer.MIN_VALUE;
int second = Integer.MIN_VALUE;
int third = Integer.MIN_VALUE;

for(int i = 0; i < z.length; i++)
{
if(z[i] > first)
{
third = second;
second = first;
first = z[i];
}
else if(z[i] > second)
{
third = second;
second = z[i];
}
else if(z[i] > third)
{
third = z[i];
}
}

return third;
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

System.out.println("3rd Largest = " + find3rdLargestValueInArray(z));
}
}