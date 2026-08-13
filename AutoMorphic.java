/* A automophoric number is an integer  whose square ends with the exact same as the number itself. */

class AutoMorphic
{
public static void main(String args[ ])
{
int no ;
int sq =0 ;
boolean flag = true;

System.out.print("Enter any no.");
no = new java.util.Scanner(System.in).nextInt(); 

sq = no* no;

while(no > 0)
{
if((no % 10) != (sq % 10))
{
flag = false;
break;
}
else
{
flag = true;
}
no = no/10;
sq = sq/10;
}
if(flag)
{
System.out.print("It is not Automorphic No.");
}
else
{
System.out.print("Non-Automorphic.");
}
}
}











