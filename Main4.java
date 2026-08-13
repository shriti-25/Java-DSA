class Main4
{
public static void main(String [ ] args)
{
int rows= 9;

for(int i=0; i< rows/2;  i++)
{
for(int j=0 ; j< rows/2-i ; j++)
{
System.out.print("  ");
}

for(int k=0; k<=i; k++)
{
System.out.print(" *  ");
}
System.out.println();
}

for(int i=rows /2 ; i>=0 ;  i--)
{
for(int j=0 ; j< rows/2-i ; j++)
{
System.out.print("  ");
}

for(int k=0; k<=i; k++)
{
System.out.print(" *  ");
}
System.out.println();
}
}
}