public class SameArgument
{
   static void show(int x, long f)
{
   System.out.println(" int long arguments ");
} 
   static void show(long x, int z)
{
   System.out.println(" long int arguments");  
}

   public static void main(String args[])
{
   show(10, 10L);
   show(10L, 10);
   //show(10 ,10); //errors
}
}
