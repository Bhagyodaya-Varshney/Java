class Test
{
    int num=9;
    static int num2=10;
    void disp()
    {
        System.out.println("Hello");
    }
    static void disp2()
    {
        System.out.println("Welcome");
    }
}
class GLA extends Test
{
    int num=11;
    static int num2=12;
    void disp()
    {
        System.out.println("Bye");
    }
    static void disp2()
    {
        System.out.println("Farewell");
    }
}
public class Tringular_Pattern1 {

    public static void main(String[] args) {
	    Test obj=new GLA();
        obj.disp();
        System.out.println(obj.num);
        obj.disp2();
        System.out.println(obj.num2);
    }
}