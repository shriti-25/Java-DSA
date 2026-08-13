class Pattern4
{
public static void main(String... s)  throws java.io.IOException
{
int i, space, rows, k =0, count=0 , count1 = 0;
 System.out.printf("Enter an Integer");

//   rows        User se input
//   i               Current row
// space        Left spaces print karne ke liye
//   k              Current row me kitne numbers print ho chuke hain
//   count       Increasing part control karta hai
//   count1     Decreasing part control karta hai

rows = new java.util.Scanner(System.in).nextInt();
 
for(i =1; i<= rows; ++i)
{
for(space =1; space<= rows-i; ++space)
{
System.out.printf( "  ");
++count ;
}

while(k  != 2 * i -1)
{
if(count <= rows -1)
{
System.out.printf("%d ", i+k);
++count;
}

else
{
++count1;
 System.out.printf("%d ",(i+k-2*count1));
}
++k;
}
count1 = count = k=0;
System.out.printf("\n");
}
}
}
