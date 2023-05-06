import java.lang.*;
import java.io.*;
import java.util.*;

class Collection5
{
    public static void main(String Arg[])
    {

        //Create LinkedList of integer
        //This is similar as template in C++
        LinkedList <String> lobj=new LinkedList<String>();

        //Insert the conents in LinkedList
        lobj.add("First");
        lobj.add("Second");
        lobj.add("Third");
        lobj.add("Fourth");
        lobj.add("Fifth");

        System.out.println("Contents of LinkedList \n"+lobj);

        //We can insert data at Specified position
        lobj.add(3,"new");
        System.out.println("Contents of LinkedList \n"+lobj);

        //We can insert data at last
        lobj.add("Two");
        System.out.println("Contents of LinkedList \n"+lobj);

        //We can remove elements from the specified position
        lobj.remove(3);
        System.out.println("Contents of LinkedList \n"+lobj);

        // We can replace the element from the specified position
        lobj.add(3,"New_Data");
        System.out.println("Contents of LinkedList \n"+lobj);

        System.out.println("Number of elements in LinkedList are : " + lobj.size());

        System.out.println("First occurance of Third is : " + lobj.indexOf("Third"));
        System.out.println("Last occurance of Third is : " + lobj.lastIndexOf("Third"));

        //We can use iterator to iterate the Array list 
        System.out.println("Iterating the LinkedList ");
        Iterator it=lobj.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}