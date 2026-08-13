import java.util.Scanner;

class Frequency
{
static void frequencyCount(int x[ ])
{
for(int i=0; i<x.length; i++)
{
int count = 1;

if(x[i] == -1)
continue;

for(int j=i+1; j<x.length; j++)
{
if(x[i] == x[j])
{
count++;
x[j] = -1;
}
}

System.out.println(x[i]+" = "+count);
}
}

public static void main(String args[ ])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter size:");
int n = sc.nextInt();

int x[ ] = new int[n];

System.out.println("Enter numbers:");
for(int i=0; i<n; i++)
x[i] = sc.nextInt();

frequencyCount(x);
}
}