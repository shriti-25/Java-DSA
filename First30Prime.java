class First30Prime
{
public static void main(String [ ] args)
{
int count   = 0;   // no. of prime number
int count1 = 0; // no. of divisor
int start =70;
 while(start<= 90)
{

for(int i =1; i <= start ;  i++)
{
int z= start % i;
if(z == 0)
{
count1++;
}
}
if(count1 == 2)
{
System.out.print(start + "\t");
count++;
}
 start++;
}
System.out.println("\nTotal Prime Numbers ="+ count);
}
}

