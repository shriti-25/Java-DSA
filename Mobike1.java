class Mobike1
{
 public static void main(String...  s)
{

int charge =0;

System.out.println("Enter the bike number");
String bno = new java.util.Scanner(System.in).nextLine();

System.out.println("Enter the customer name");
String name = new java.util.Scanner(System.in).nextLine();

System.out.println("Enter the no. of days");
int days = new java.util.Scanner(System.in).nextInt();
  
if(days <=5)
{
charge = 500* days;
}
else if(days>5 && days<=10)
{
charge = 2500+ 400*(days-5);
}
else if(days>10)
{
charge = 2500+2000+ 200*(days-10);
}
System.out.print("Bike no" + "\t\t" +"Customer name"+ "\t\t"+ "Days"+ "\t\t"+ "Charge");
System.out .println(" ");
System.out.print(bno +"\t\t");
System.out.print(name + "\t\t");
System.out.print(days+"\t\t");
System.out.print(charge+"\t\t");
}
}

