public class EndsWith
{
public static void main(String args[ ])
{

String Str = new String("This is really not immutable");
Boolean retVal ;

retVal = Str.endsWith( "immutable !! " );
System.out.println("Returned String :" + retVal);

retVal = Str.endsWith("table");
System.out.println("Returned String :" + retVal);

}
}