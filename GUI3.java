import java.awt.*;

class MarvellousFrame
{
    public Frame fobj;
    
    public MarvellousFrame(String title)
    {
        fobj=new Frame(title);
        fobj.setSize(400,400);
        fobj.setVisible(true);
        fobj.addWindowListener(new Marvellous());
    }
}
class Marvellous extends WindowAdapter
{
    public void windowCosing()
    {
        System.exit(0);
    }
}
class GUI3
{
    public static void main(String Arg[])
    {
        MarvellousFrame mobj=new MarvellousFrame("PPA");
    }
}