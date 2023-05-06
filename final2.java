class Base
{
    public void fun()
    {
        System.out.print("Base fun");
    }
    final public void gun()
    {
        System.out.print("Base gun");
    }
}
class Derived extends Base
{
    public void fun()
    {
    System.out.println("Derived fun");
    }
    // public void gun()
    // {
    //     System.out.print("Derived gun");
    // }
}

class final2 
{
    public static void main(String Arg[])
    {
        Base obj=new Derived();
        obj.fun();   //Derived fun
        obj.gun();   //Base fun
    }
}
