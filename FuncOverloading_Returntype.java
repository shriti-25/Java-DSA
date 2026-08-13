
class FuncOverloading_Returntype 
{
    static void show(char x)
{
    System.out.println("no return type");
}
    static int show(int x)
{
    System.out.println("with return type");
    return x;
}
    public static void main(String...s765)
{
        show('a');
        //show(200);
        int a = show(10);
        System.out.println(a);
}
}
