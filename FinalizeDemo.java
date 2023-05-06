
class Marvellous 
{
    public int No1;
    public int No2;
    public Marvellous()
    {
        System.out.println("Inside Default constructor");
        No1=0;
        No2=0;
    }
    public Marvellous(int a,int b)
    {
        System.out.println("Inside Parametrised constructor");
        No1=a;
        No2=b;
    }
    protected void finalize()
    {
        System.out.println("Inisde Finalize method");
    }
}


class FinalizeDemo 
{
    public static void main(String Arg[])
    {
        Marvellous mobj1=new Marvellous();
        Marvellous mobj2=new Marvellous(10,11);

        mobj1=null;
        mobj2=null;
        System.gc();
    }
}