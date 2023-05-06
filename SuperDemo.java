class Base
{
    public int A;

    public Base()
    {
        System.out.println("Inside Base Default constructor");
        this.A=11;
    }

    public Base(int i)
    {
        System.out.println("Inside Base Parametrised constructor");
        this.A=11;
    }

    public void fun()
    {
        System.out.println("Inside Base fun");
    }
}
class Derived extends Base   //class derived : public Base
{
    public int A;
    public Derived()
    {
        super(11);
        System.out.println("Inside Derived constructor");
        this.A=51;
    }

    public void gun()
    {
        System.out.println("Inside Derived gun");
        System.out.println("Value of A : "+A);
        System.out.println("Value of A : "+this.A);
        System.out.println("Value of A : "+super.A);
        super.fun();
    }
} 

class SuperDemo 
{
    public static void main(String Arg[])
    {
       Derived dobj=new Derived();
       dobj.gun();

    }
}
