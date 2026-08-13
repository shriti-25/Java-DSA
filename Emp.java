class Emp 
{
    int salary;

Emp()
{
    salary = 15000;
 
}
    void show()
{
    System.out.print(salary);
}
   public static void main(String[] args) 
{
     System.out.print(new Emp().salary);
     new Emp().show();
     System.out.print(new Emp());
}
}
