import Marvellous.Arithematic;
import Marvellous.Mathematics;
import Marvellous.Batches.PPA;

class PackageDemo
{
    public static void main(String Arg[])
    {
        Arithematic aobj=new Arithematic();
        Mathematics mobj=new Mathematics();
        PPA pobj=new PPA();

        int iRet=0;

        iRet=aobj.Addition(10,11);
        System.out.println("Addition is : "+ iRet);
        
        iRet=aobj.Subtraction(10,11);
        System.out.println("Subtraction is : "+ iRet);

        iRet=mobj.square(10);
        System.out.println("Square is : "+ iRet);

        iRet=mobj.Cube(10);
        System.out.println("Cube is : "+ iRet);

        pobj.Display();

    }
}