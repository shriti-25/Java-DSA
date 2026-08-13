
class Student{
    String name;
    static String college = "KNIT";
}
public class staticDM {
    public static void main(String args[])
    {
     Student s1 = new Student();
      s1.name ="Priti";

     Student s2 = new Student();
     s2.name ="Sandeep";

     System.out.println(s1.name + " " +  s1.college);
     
     System.out.println(s2.name + " " +  s2.college);
    }

    
}
