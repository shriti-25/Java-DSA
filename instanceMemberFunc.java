
class Student {
    String name ;
    String college;

 public void show()
 {
    System.out.println( name + " "  + college);
 } 

}

public class instanceMemberFunc {
    public static void main()
    {
     Student s1 = new Student();
      s1.name ="Priti";
      s1.college ="KNIT";
      
     Student s2 = new Student();
     s2.name ="Sandeep";
     s2.college ="ABES";
      
     s1.show();
     s2.show();
    }
    
}
