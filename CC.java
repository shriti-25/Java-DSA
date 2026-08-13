class A 
{

 A(){
 //super()----> implicit super() inserted by compiler
 System.out.println("A");
}
}

class B extends A
{
 B(int x)
 {
  System.out.println(x);
 }
 B(){
    //super()----> implicit super() inserted by compiler
    System.out.println("B");
 }
}

class CC extends B{
    {
    
        System.out.println("Init block of CC");
    }
    CC(){
        
        System.out.println("CC");
        super(10);
    }

    CC(int x)
    {
        System.out.println(x);
    }
    public static void main(String... s){
        new CC();
        // new CC(12);
    }
}

