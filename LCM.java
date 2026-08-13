import java.util.Scanner;
class LCM
{
static void lcm(int x[ ])
{
int l = x[0];

for(int i = 1; i < x.length; i++)
{
int a = l;
int b = x[i];

while(b != 0)
{
int r = a % b;
a = b;
b = r;
}

l = l / a * x[i];
}

System.out.println("LCM = " + l);
}

public static void main(String args[ ])
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter size:");
int n = sc.nextInt();

int x[ ] = new int[n];

System.out.println("Enter numbers:");
for(int i = 0; i < n; i++)
x[i] = sc.nextInt();

lcm(x);
}
}