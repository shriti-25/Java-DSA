
class Student{
    String name ;
    int rollNo ;

}
 public class instanceDM
 {
public static void main(String args[])
{
 Student s1 = new Student();
 Student s2 = new Student();

 s1.name = "Rahul";
 s1.rollNo = 1;

  s2.name = "Simran";
  s2.rollNo = 2;

  System.out.println(s1.name +" " + s1.rollNo);
  System.out.println(s2.name +" " + s2.rollNo);

 }
 }