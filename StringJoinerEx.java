import java.util.StringJoiner;

class StringJoinerEx
{
public static void main(String args[ ])
{
StringJoiner sj = new StringJoiner("@","(",")");

sj.add("Lalu");
sj.add("Kumar");
sj.add("Yadav");

System.out.println(sj);

}
}