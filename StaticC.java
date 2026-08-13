class StaticC 
{
 static int x;

 static {
     System.out.println("static block");
     x= new java.util.Scanner(System.in).nextInt();
 }   
}

class StaticTest1
{
    public static void main(String s[])
    {
    System.out.println("main from static Test1");
    System.out.println(StaticC.x);

    System.out.println("after static block from StaticTest1");
    }
}

class StaticTest2
{
    public static void main(String s[])
    {
    System.out.println("main from static Test2");
    System.out.println(StaticC.x);

    System.out.println("after static block from StaticTest2");
    }
}
