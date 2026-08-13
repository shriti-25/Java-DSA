class TempStatic 
{
 static int x;
 static {
    x= readInt();
 } 
 
 //static int readInt()
   // {
  //   return 10;
  //  }

 public static void main(String args[])
 {
    System.out.println("main");
 }
}

class Temp1
{
        public static void main(String args[])
{
    System.out.print(TempStatic.x);
    System.out.println(TempStatic.x);
    TempStatic.x = 40;
}
}

class Temp2
{
    public static void main(String args[])
{
    System.out.print(TempStatic.x);
}
}