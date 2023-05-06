class Base
{
    public void fun()
    {
        System.out.println("Base fun");
    }
    public void gun()
    {
        System.out.println("Base fun");
    }
    public void sun()
    {
        System.out.println("Base fun");
    }
}

class Derived extends Base
{
    public void fun()
    {
        System.out.println("Derived fun");
    }
    public void gun()
    {
        System.out.println("Derived fun");
    }
    public void run()
    {
        System.out.println("Base run");
    }
}

public class Overriding
{
    public static void main(String Arg[])
    {
        Base bobj=new Derived();
        bobj.fun();   //Derived fun
        bobj.gun();   //Derrived gun
        bobj.sun();   //Base sun
        // bobj.run();
    }
}
