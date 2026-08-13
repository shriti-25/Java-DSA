class Base{
    int x= 20;
    void show()
    {
        System.out.println("Base");
    }
}
 
class Childs extends Base{
    int x= 30;
    void show(){
    super.show();
        System.out.println("Child");
    }

    void display()
    {
     System.out.println("Display");   
    }

    public static void main(String... s)
{
    Base  b = new Childs(); //upcasting
   //Base b1 = new Base();
  // b1.show();
    b.show();
  System.out.println(b.x);
    Childs c = (Childs)b; //downcasting
    c.display();
   // System.out.println(b.x);
    System.out.println(c.x);
}
    
}
