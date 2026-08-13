import java.util.Scanner;

class HCF
{
static void HCF(int x[])
{
int hcf = x[0];

for(int i = 1; i < x.length; i++)
{
int a = hcf;
int b = x[i];

while(b != 0)
{
int r = a % b;
a = b;
b = r;
}

hcf = a;
}

System.out.println("HCF = " + hcf);
}

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter size:");
int n = sc.nextInt();

int x[ ] = new int[n];

System.out.println("Enter numbers:");

for(int i = 0; i < n; i++)
{
x[i] = sc.nextInt();
}

HCF(x);
}
}