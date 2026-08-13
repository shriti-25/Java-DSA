class Student {
    String name ;
    static String college = "KNIT";

    static void showCollege()
    {
        System.out.println("college name =" + college);
    }
}

public class staticMemberFunc {
    public static void main(String args[])
    {
     Student s1 = new Student();
     Student s2 = new Student();

     s1.name ="Priti" ;
     s2.name ="Sandeep" ;

     s1.showCollege();
     s2.showCollege();

     System.out.println("Student 1 Name = " + s1.name);
     System.out.println("Student 2 Name = " + s2.name);

    }
}
