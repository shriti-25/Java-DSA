class Disease
{
public static void main(String... s) throws Exception
{

System.out.println("Number the classes held");
 int n1= new java.util.Scanner(System.in).nextInt();

System.out.println("Number the classes attend");
 int n2=  new java.util.Scanner(System.in).nextInt();

System.out.println("Enter the medical issues");
 int x = System.in.read();

char ch =(char)x;
 int per =(n2*100)/n1;

if(per>=75)
System.out.println("allowed to sit in the exam ="+per);

else if(ch =='Y' || ch =='y')
System.out.println("allowed to sit in the exam ="+per);

else
System.out.println(" not allowed to sit in the exam ="+per);
}
}
