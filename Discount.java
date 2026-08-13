class Discount
{
public static void main(String... s)
{

 int totalPrice = 0;
System.out.println("enter the units");
 int units = new java.util.Scanner(System.in).nextInt();

int prices = units* 100;

if(prices> 1000)
{
totalPrice  = (prices*10)/100;
}
else
totalPrice  =  prices;
System.out.println("TotalPrices=" + totalPrice);
}
}
