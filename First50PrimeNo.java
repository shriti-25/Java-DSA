class First50PrimeNo
{
public static void main(String [ ] args)
{
int count   = 0;    // number of prime number
int count1 = 0;  // number of divisor
int start    = 2;

while(true)
{
  for(int i =1; i<=start; i++)
 {
 int z = start % i;
 if (z==0)
{
 count1++;
}
}
 if(count1 == 2)
{
System.out.print(start+"  ");
count++;
}
if(count == 50)
break;

start++;
count1 =0;
}
}
}
