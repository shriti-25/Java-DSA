abstract class Base{
    int x;
    int y;
    void show(){
        System.out.print(x);
        System.out.print(y);
    }
    abstract void display();
}

class MyRegister{
    void register(Base b){
        b.display();
    }
}

class Child3 extends Base{
    void get(int x ,int y){
        this.x =x;
        this.y =y;
    }
    void display(){
        System.out.print("display");
    }
public static void main(String args[]){
    Child3 c1 = new Child3();
    MyRegister mr = new MyRegister();
    mr.register(c1);
}    
}
