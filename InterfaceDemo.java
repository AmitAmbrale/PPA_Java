interface  Circle
{
    public float PI=3.14f;

    public float CalculateArea(float Radius);
    public float CalculateCircumference(float Radius);
}

class Demo implements Circle
{
    public float CalculateArea(float Radius)
    {
        return  PI *Radius *Radius;
    }
    public float CalculateCircumference(float Radius)
    {
        return 2*PI*Radius;
    }


}

public class InterfaceDemo 
{
    public static void main(String Arg[])
    {
        Demo obj=new Demo();
        float fRet=0.0f;

        fRet=obj.CalculateArea(10);
        System.out.println("Area of circle is : "+ fRet);

        fRet=obj.CalculateCircumference(10);
        System.out.println("Circumference of circle is : "+ fRet);


    }
}
