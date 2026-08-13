class AtClassLevel
{
 
  int x= 10;
  int y= 20;

void show()
{
    System.out.println(x);
    System.out.println(y);
}
public static void main(String... s)
{
    DConstructor d1 = new DConstructor();
    d1.show();
    DConstructor d2 = new DConstructor();
    d2.show();
}
}
