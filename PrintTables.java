class PrintTables
{
public static void main(String... s)
{
 int i=1;
 int number ;

System.out.println("Enter the number");
 number = new java.util.Scanner(System.in).nextInt();

do
{
System.out.printf(" %d *   %d = %d " ,number,i,number *i);
System.out.println();

i++;
} 
while(i<=10)
}

}