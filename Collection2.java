import java.util.*;

class Collection2
{
    public static void main(String Arg[])
    {
       Hashtable <String,Integer>hobj=new Hashtable<String,Integer>();

       hobj.put("C program",990);
       hobj.put("C++ program",1200);
       hobj.put("Java program",780);
       hobj.put("Phyton program",1650);

       System.out.println("book price of java "+hobj.get("Java program"));
       hobj.remove("C++ program");

       Enumeration eobj=hobj.keys();

       while(eobj.hasMoreElements());
       {
            System.out.println(eobj.nextElement());
       }

    }
}